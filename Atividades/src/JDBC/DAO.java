package src.JDBC;

import java.sql.*;

public class DAO {
    private Connection conexao = FabricaConexao.getConexao();
    //Metodo criado para fazer a conexao
    public int input(String sql, Object... atributos) throws SQLException {
        try {
            PreparedStatement stmt =
                    getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributo(stmt, atributos);
            if(stmt.executeUpdate()>0){
                ResultSet result = stmt.getGeneratedKeys();
                if(result.next())return result.getInt(1);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return -1;
    }
    public void close(){
        try {
            getConexao().close();
        } catch (SQLException ignored){
        }finally {
            conexao = null;
        }
    }
    /*
    * Metodo para adicionar indice e atributo
    * E converte atributo para String ou Integer*/
    private void adicionarAtributo(PreparedStatement stmt, Object[] atributos) throws SQLException{
        int index = 1;
        for(Object atributo: atributos){
            if (atributo instanceof String){
                stmt.setString(index, (String) atributo);
            }else if(atributo instanceof Integer){
                stmt.setInt(index, (Integer) atributo);
            }
            index++;
        }
    }
    //Metodo para validar a conexão
    private Connection getConexao() throws SQLException {
        try {
            if (conexao != null && !conexao.isClosed()) return conexao;
        }catch (SQLException ignored){}
        conexao = FabricaConexao.getConexao();
        return conexao;
    }

}
