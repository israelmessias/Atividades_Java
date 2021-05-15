package src.JDBC;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarLike {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoa where nome like ?";

        System.out.println("Consulte o Funcinario: ");
        String name = input.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%"+name+"%");
        ResultSet resultado = stmt.executeQuery();

        List<J_Pessoa> JPessoas = new ArrayList<>();

        while(resultado.next()){
            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            JPessoas.add(new J_Pessoa(id, nome));
        }
        for(J_Pessoa pes: JPessoas){
            System.out.println(pes.getId()+" -> "+ pes.getNome());
        }
    }
}
