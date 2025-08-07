package jdbc;

import jdbc.DAO.DAO;

public class DAOTeste {
    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.inculir(sql, "Joelton"));
        System.out.println(dao.inculir(sql, "Djalma"));
        System.out.println(dao.inculir(sql, "Walter"));
        System.out.println(dao.inculir(sql, "Muriel"));

        dao.close();
    }
}
