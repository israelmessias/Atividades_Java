package Lambda.Operador;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperdadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (nota1, nota2) -> (nota1 + nota2) / 2;

        System.out.println(media.apply(9.7, 7.5));

        /*O BiFunction permite dois tipos de parametros e um tipo de retorno*/
        BiFunction<Double, Double, String> resultado = 
            (nota1, nota2) -> ((nota1+nota2)/2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado.apply(4.5, 7.5));
    }
    
}
