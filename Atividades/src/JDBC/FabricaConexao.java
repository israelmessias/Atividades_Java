package src.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao{
    //Classe estatica feita para conexão
    public static Connection getConexao() throws SQLException {
        try{
            final String url = "jdbc:mysql://localhost/curso_java";
            final String nome = "israel";
            final String senha = "Gatopersa6";

            return DriverManager.getConnection(url, nome, senha);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
