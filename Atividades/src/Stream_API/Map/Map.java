package Stream_API.Map;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;


public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda \n");

        //usou a função map para transformar a strings da List em todas em maisuculo
        marcas.stream().map((m -> m.toUpperCase())).forEach(print);

        marcas.stream().map(Utiliatrio.maiuscula).map(Utiliatrio.primeiraLetra)
                .map(Utiliatrio::grito).forEach(print);

    }
}
