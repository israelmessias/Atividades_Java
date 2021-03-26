package Stream_API.FIlter.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Aprovação {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println;

        Restaurante cheirodeTempero =
                new Restaurante("Cheiro de Tempero", true, false);
        Restaurante boinaBrasa =
                new Restaurante("Boi na Brasa", false, false);
        Restaurante veganSalvador =
                new Restaurante("Vegan Salvador", true, false);
        Restaurante salNaBarra =
                new Restaurante("Sal na Barra", true, true );
        Restaurante salvadorJapan =
                new Restaurante("Salvador Japan", false, true);
        Restaurante india =
                new Restaurante("India", true, false);
        Restaurante oGaucho =
                new Restaurante("O Gaucho", true, true);
        Restaurante cachorroQuentePaulista =
                new Restaurante("Cachoro Quente Paulista", false, false);

        List<Restaurante> restaurantes =  
               Arrays.asList(boinaBrasa, cachorroQuentePaulista, cheirodeTempero, india, oGaucho, salNaBarra, salvadorJapan, veganSalvador);

        Predicate<Restaurante> aprovaçãoClientes = c -> c.clientes;
        Predicate<Restaurante> aprovaçãoCritica = c -> c.critica;
        Function<Restaurante, String> congratulations =
                g -> "Parabens! O Restaurante "+ g.nomeRestaurante+" tem uma exelente aprovação! ☆☆☆☆☆";

        restaurantes.stream().filter(aprovaçãoClientes).filter(aprovaçãoCritica).map(congratulations).forEach(println);

    }


}
