package src.JDBC;

import java.sql.SQLException;

public class DAOTeste {
    public static void main(String[] args) throws SQLException {
        DAO dao = new DAO();
        String sql = "INSERT INTO pessoa (nome, id) VALUES(?,?)";
        dao.input(sql, "Helbert Gerson", 10);

    }
}
