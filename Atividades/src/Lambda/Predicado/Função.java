package Lambda.Predicado;

import java.util.function.Function;

public class Função {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = 
             numero -> numero % 2 == 0? "Par" : "Impar";

        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoE = 
            valor -> "O resultado é: " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        //Composição de Função
        String resultadoFinal = parOuImpar.andThen(oResultadoE).
        andThen(empolgado).apply(33);

        System.out.println(resultadoFinal);
    }
    
}
