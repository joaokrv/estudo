package jdbc.DAO;

import jdbc.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    // Conexão com o banco de dados (reutilizada enquanto estiver aberta)
    private Connection link;

    /**
     * Insere um registro no banco de dados com os atributos fornecidos
     * @param sql SQL de inserção com placeholders (?)
     * @param atributos Valores a serem inseridos nos placeholders
     * @return ID gerado automaticamente (caso haja), ou -1 se falhar
     */
    public int inculir(String sql, Object... atributos) {
        try {
            // Prepara o SQL e indica que deseja obter a chave gerada (ex: ID)
            PreparedStatement stmt = getLink().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // Preenche os parâmetros na query
            addAtributos(stmt, atributos);

            // Executa a inserção e verifica se pelo menos uma linha foi afetada
            if (stmt.executeUpdate() > 0) {
                ResultSet resultado = stmt.getGeneratedKeys();
                if (resultado.next()) {
                    return resultado.getInt(1); // Retorna o ID gerado
                }
            }

            return -1; // Indica falha ou nenhuma chave gerada

        } catch (SQLException e) {
            throw new RuntimeException(e); // Encapsula exceção SQL em Runtime
        }
    }

    /**
     * Atribui os valores ao PreparedStatement de forma dinâmica
     * @param stmt PreparedStatement com placeholders
     * @param atributos Valores que serão inseridos nos placeholders
     */
    private void addAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
        int indice = 1;
        for (Object atributo : atributos) {
            // Verifica tipo do atributo e aplica o método adequado
            if (atributo instanceof String) {
                stmt.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer) {
                stmt.setInt(indice, (Integer) atributo);
            }
            indice++; // Avança para o próximo placeholder
        }
    }

    /**
     * Garante que a conexão esteja aberta e válida, reabrindo se necessário
     * @return Uma conexão ativa com o banco de dados
     */
    private Connection getLink() {
        try {
            if (link != null && !link.isClosed()) {
                return link;
            }
        } catch (SQLException e) {
            // Silenciosamente ignora a exceção
        }

        // Abre nova conexão se for nula ou fechada
        link = Conexao.getConexao();
        return link;
    }

    /**
     * Fecha a conexão com o banco de dados e limpa o objeto de conexão
     */
    public void close() {
        try {
            getLink().close(); // Fecha conexão atual
        } catch (SQLException e) {
            // Silenciosamente ignora falhas ao fechar
        } finally {
            link = null; // Garante que a conexão seja descartada
        }
    }
}
