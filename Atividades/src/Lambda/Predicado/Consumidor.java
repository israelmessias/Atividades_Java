package Lambda.Predicado;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Consumidor {
     public static void main(String[] args) {
        Consumer<Produto> imprimiConsumer = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.34, 2.5);
        imprimiConsumer.accept(p1);

        Produto p2 = new Produto("Notebook", 2987.99, 2.5);
        Produto p3 = new Produto("Caderno", 19.90, 1.5);
        Produto p4 = new Produto("Borracha", 7.00, 0.99);
        Produto p5 = new Produto("Lapis", 4.39, 0.35);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimiConsumer);
        produtos.forEach(System.out::println);//Ela imprimi o toString
    }
    
}
