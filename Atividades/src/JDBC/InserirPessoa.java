package src.JDBC.InseirPessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class InseirPessoa {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();//
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        String sql = "insert into pessoa (nome) value (?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();

        conexao.close();
        input.close();
    }
}
