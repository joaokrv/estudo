package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBancoDeDados {
    public static void main(String[] args) throws SQLException {

        //final String url = "jdbc:mysql://localhost:3306/jdbc_curso?verifyServerCertificate=false&useSSL=true";
        //final String usuario = "root";
        //final String senha = "admin123";

        //Connection link = DriverManager.getConnection(url, usuario, senha);

        Connection link = Conexao.getConexao();

        Statement stmt = link.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS jdbc_curso");

        link.close();
    }
}
