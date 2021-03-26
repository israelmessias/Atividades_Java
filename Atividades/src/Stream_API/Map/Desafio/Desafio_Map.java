package Stream_API.Map.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio_Map {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println;
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6 ,7 , 8, 9);


        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binarioPdecimal = n -> Integer.parseInt(n, 2);

        number.stream().map(Integer::toBinaryString).map(inverter)
                .map(binarioPdecimal).forEach(println);

    }
}
