package Lambda.Foreach;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana","Bia", "Lia", "Gui");

        System.out.println("Forma Tradicional...");
        for(String nome: aprovados){
            System.out.println(nome);

        }
        System.out.println("Forma Tradicional...");

        aprovados.forEach (nome-> System.out.println(nome + "!!!"));
        aprovados.forEach(System.out::println);

        System.out.println("\nExemplo 2\n");
        aprovados.forEach(nome-> meuImprimir(nome));

        System.out.println("\nExemplo 3\n");
        aprovados.forEach(Foreach :: meuImprimir);
    }
    static void meuImprimir(String nome){
        System.out.println("Meu nome "+nome);
    }
}
