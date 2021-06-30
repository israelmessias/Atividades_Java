package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TabelaPessoa {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        String sql = """
                CREATE TABLE pessoa(
                id INT AUTO_INCREMENT PRIMARY KEY,
                nome VARCHAR(200) not null
                );
                """;

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!");
        conexao.close();
    }
}
