package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {

        Connection link = Conexao.getConexao();
        Scanner in = new Scanner(System.in);

        String sqlSelect = "SELECT * FROM pessoas WHERE codigo = ?";
        String sqlDelete = "DELETE FROM pessoas WHERE codigo = ?";

        System.out.println("Insira o código que deseja excluir: ");
        int codigo = in.nextInt();
        in.nextLine();

        PreparedStatement selectStmt = link.prepareStatement(sqlSelect);
        selectStmt.setInt(1, codigo);
        ResultSet resultado = selectStmt.executeQuery();

        if (!resultado.next()) {
            System.out.println("Pessoa não encontrada.");
            link.close();
            in.close();
            return;
        }

        String nome = resultado.getString("nome");
        System.out.println("Nome atual: " + nome);

        PreparedStatement deleteStmt = link.prepareStatement(sqlDelete);
        deleteStmt.setInt(1, codigo);
        int excluidos = deleteStmt.executeUpdate();

        if (excluidos > 0) {
            System.out.println("\nPessoa excluída com sucesso.");
            System.out.print("Linhas afetadas: " + excluidos);
        } else {
            System.out.println("Erro ao excluir a pessoa.");
        }

        selectStmt.close();
        deleteStmt.close();
        in.close();
        link.close();
    }
}
