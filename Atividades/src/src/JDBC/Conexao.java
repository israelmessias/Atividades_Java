package src.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost";// URL do banco de dados
        final String nome = "israel";// usuario root
        final String senha = "Gatopersa6";//senha do banco

        /*
        A classe DriverManager é a responsável por se comunicar com todos os drivers que que é deixado disponível.
         Para isso, é invocado o método estático getConnection com uma string que indica a qual banco deseja conectar.
         */
        Connection conexao = DriverManager.getConnection(url, nome, senha);

        System.out.println("Sucesso!");
        conexao.close();
    }
}
