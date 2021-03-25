package Lambda.Operador;

import java.util.function.UnaryOperator;

public class OperadoUnario {
    public static void main(String[] args) {
        
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = maisDois.andThen(vezesDois).
        andThen(aoQuadrado).apply(0);
        System.out.println(resultado1);
        
        /*O composer ele encadea cada função na ordem, ou seja, antes
        do ao quadrado, primeiro o vezesDois e depois maisDois
        */
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(resultado2);

    }
}
