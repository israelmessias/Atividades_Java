package src.JDBC;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException{
        Connection conexao = FabricaConexao.getConexao();

        /*É o comando que vai ser interpretado pelo SGBD. Podem ser 4 tipos de statement:
        *SELECT, INSERT, UPDATE, DELETE
         */
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso!");
    }
}
