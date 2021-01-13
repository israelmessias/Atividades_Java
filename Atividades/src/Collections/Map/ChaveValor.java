package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class ChaveValor {
    public static void main(String[] args) {
        var usuario= new HashMap<String, Integer>();

        usuario.put("Roberto", 13);
        usuario.put("Thiago", 25);
        usuario.put("Gisele", 37);

        System.out.println(usuario.keySet());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());

        for(Map.Entry <String, Integer> registro: usuario.entrySet()){
            System.out.println(registro);
        }
    }
}
