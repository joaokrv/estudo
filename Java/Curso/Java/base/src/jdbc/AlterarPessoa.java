package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarPessoa {
    public static void main(String[] args) throws SQLException {

        Connection link = Conexao.getConexao();
        Scanner in = new Scanner(System.in);

        String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        String sqlSelect = "SELECT * FROM pessoas where codigo = ?";

        System.out.println("Informe o código da pessoa que deseja alterar:");
        int codigo = in.nextInt();
        in.nextLine();

        PreparedStatement stmt = link.prepareStatement(sqlSelect);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();

        if (!resultado.next()) {
            System.out.println("Pessoa não encontrada.");
            link.close();
            in.close();
            return;
        }

        String nomeAntigo = resultado.getString("nome");
        System.out.println("Nome atual: " + nomeAntigo);

        System.out.print("Insira o novo nome: ");
        String nomeAtualizado = in.nextLine();

        stmt = link.prepareStatement(sqlUpdate);
        stmt.setString(1, nomeAtualizado);
        stmt.setInt(2, codigo);
        int atualizados = stmt.executeUpdate();

        if (atualizados > 0) {
            System.out.println("Nome atualizado com sucesso!");
        }

        // Exibe os dados atualizados
        stmt = link.prepareStatement(sqlSelect);
        stmt.setInt(1, codigo);
        resultado = stmt.executeQuery();

        if (resultado.next()) {
            System.out.println("Dados atualizados:");
            System.out.println(resultado.getInt("codigo") + " ==> "
                    + resultado.getString("nome"));
        }

        in.close();
        link.close();
    }
}
