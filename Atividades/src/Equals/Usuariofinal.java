package Equals;
import java.util.Date;

public class Usuariofinal {
    public static void main(String[] args) {
        var u1 = new Usuario();
        var u2 = new Usuario();

        u1.nome = "João";
        u1.email = "joão@gmail.com";

        u2.nome = "João";
        u2.email = "joão@gmail.com";

        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
        System.out.println(u2.equals(new Date()));
    }
}
