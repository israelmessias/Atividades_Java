package Collections.Fila;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue <String> lista = new LinkedList<>();
        //Adicionar elementos
        //Caso adicione mais elementos do que a quantidade que ele suporta
        lista.add("Thiago");//Retorna False
        //Caso adicione mais elementos do que a quantidade que ele suporta
        lista.offer("Janaina");//Retorna exception
        lista.add("Thania");
        lista.offer("Sabrina");

        System.out.println(lista.peek());//Lista  um elemento
        System.out.println(lista.element());//Lista  um elemento
        System.out.println(lista.peek());//Gera um null
        System.out.println(lista.element());//Gera uma exceção

        System.out.println(lista.remove());//Remove um elemento da fila, e gera uma exceção caso não tenha elemento
        System.out.println(lista.poll());//Remove um elemento da fila, e gera um null caso não tenha elemento
    }
}
