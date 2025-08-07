package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {

        Connection link = Conexao.getConexao();
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um nome:");
        String nome = in.nextLine();

        String sql = "INSERT INTO pessoas (nome) VALUES(?)";

        PreparedStatement stmt = link.prepareStatement(sql);
        stmt.setString(1, nome);

        stmt.execute();

        in.close();
        link.close();
    }
}
