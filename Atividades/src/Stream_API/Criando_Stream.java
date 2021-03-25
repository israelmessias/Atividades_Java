package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Criando_Stream {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println;//Criou uma função para imprimir um forech
        Consumer<Object> print = System.out::print;
        //
        Stream<String> langs = Stream.of("Java ", "Javascript  ", "PHP ", "C++ \n");
        langs.forEach(println);

        //String [] cria uma lista
        String[] maisLangs = {"Pythn ", "Go ", "Rust \t", "Cloujure \n"};
        //a função of selecona um lista
       Stream.of(maisLangs).forEach(print);

       Arrays.stream(maisLangs).forEach(print);
       Arrays.stream(maisLangs, 1,3).forEach(print);

        List<String> outrasLangs = Arrays.asList("\nKotlin ", "Dart", "Swift\n");
        outrasLangs.parallelStream().forEach(println);//Aleatorio

        //Stream.generate(() -> "a").forEach(println); || Infinito
        //Stream.iterate(0, n -> n+1).forEach(println);

    }
}
