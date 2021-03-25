package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Stream;

public class Imprimir_Objetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Bia", "Ana", "Samuel", "Levi");

        System.out.println("Usando Forech...");
        for (String nome:aprovados){
            System.out.println(nome);
        }

        //A Iteratoré um objeto que pode ser usado para percorrer coleções, como ArrayList e HashSet .
        // É chamado de "iterador" porque "iterar" é o termo técnico para loop.
        System.out.println("\n Usando Interator...");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nUsando Stream...");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço interno!!!


    }
}
