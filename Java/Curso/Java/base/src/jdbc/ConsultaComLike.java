package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaComLike {
    public static void main(String[] args) throws SQLException {

        Connection link = Conexao.getConexao();
        Scanner in = new Scanner(System.in);

        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        System.out.println("Informe um nome pra pesquisa:");
        String pesquisa = in.nextLine();

        PreparedStatement stmt = link.prepareStatement(sql);
        stmt.setString(1, "%" + pesquisa + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p: pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        in.close();
        link.close();
    }
}
