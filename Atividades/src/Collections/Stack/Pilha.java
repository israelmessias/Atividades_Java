package Collections.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();
        livros.add("O Pequeno Principe");//Caso adicione um elemento acima da quantidade da pilha, retorna false
        livros.push("O Hobbit");//Caso adicione um elemento acima da quantidade da pilha, retorna exceção
        livros.add("Biblia Sagrada");
        livros.push("O Monge e o executivo");
        livros.add("Memorias Póstumas de Brás Cuba");

        //System.out.println(livros.pop()); Remove um elemento, caso não tenha elemento da um exepition
       //System.out.println(livros.remove());  Remove um elemento, caso não tenha elemento da um exepition
        //System.out.println(); Remove um elemento, caso não tenha elemento da um null
    }
}
