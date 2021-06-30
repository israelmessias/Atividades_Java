package JDBC;
import java.sql.*;
import java.util.Scanner;

public class Atualizar {
    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o id do funcionario: ");
        int id = input.nextInt();

        String sql = """
                SELECT * FROM pessoa WHERE id = ?;
                """;
        String update = "UPDATE curso_java.pessoa SET nome = ? WHERE curso_java.pessoa.id = ?";
        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet resultado = stmt.executeQuery();

        if(resultado.next()){
            J_Pessoa funcionario = new J_Pessoa(resultado.getInt(1),
                    resultado.getString(2));
            System.out.println("O nome atual é: "+funcionario.getNome());
            input.nextLine();

            System.out.println("Atualize: ");
            String nome = input.nextLine();

            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, nome);
            stmt.setInt(2, id);
            stmt.execute();
        }

        conexao.close();
        input.close();
    }
}
