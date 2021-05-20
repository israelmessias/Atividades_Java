package src.JDBC;
import java.io.*;
import java.sql.*;
import java.util.Properties;

public class FabricaConexao{
    //Classe estatica feita para conexão
    public static Connection getConexao() {
        try{
            Properties prop = getProperties();
            final String url = prop.getProperty("bank.url");
            final String user = prop.getProperty("bank.user");
            final String password = prop.getProperty("bank.password");

            return DriverManager.getConnection(url, user, password);

        }catch (SQLException | IOException e){
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        //InputStream para leitura de dados || FileInputStream leitura de arquivo

        try{
            InputStream stream = new FileInputStream
                    ("/home/israelmessias/Desenvolvimento/Atividades_Java/Atividades/conexao.properties");
            Properties prop = new Properties();
            prop.load(stream);
            return prop;
        }catch(IOException i){
            throw new IOException(i);
        }
    }
}
