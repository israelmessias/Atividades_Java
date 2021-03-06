package JDBC;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import JDBC.*;

public class ConsultarPessoa {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoa";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<J_Pessoa> JPessoas = new ArrayList<>();

        while(resultado.next()){
            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            JPessoas.add(new J_Pessoa(id, nome));
        }
        System.out.println("ID || NOME");
        for(J_Pessoa pes: JPessoas){
            System.out.println(pes.getId()+" -> "+ pes.getNome());
        }}}
