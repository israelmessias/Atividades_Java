package Lambda.Predicado;

import java.util.function.Predicate;
//A interface funcional refere-se ao método test(T t) que retorna um booleano. Quando passamos um parâmetro para este método, ele avalia o objeto sobre a expressão lambda que foi atribuído.
public class Predicado{
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preço * (1 - prod.desconto)) >= 750;

        Produto produto = new Produto("Notebook", 3559.85, 125.5);
        System.out.println(isCaro.test(produto));
        }
    }

