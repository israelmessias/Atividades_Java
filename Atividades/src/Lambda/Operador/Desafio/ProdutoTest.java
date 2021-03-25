package Lambda.Operador.Desafio;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.function.*;

public class ProdutoTest {
    public static void main(String[] args) {

        //Função do valor com desconto
        Function<Produto, Double> valorDesc = produto1 ->
                produto1.preço - (1 * produto1.desconto);
        //Função para para calcular o imposto
        UnaryOperator<Double> valorImpos = valorcomDesc ->
                (valorcomDesc >= 2500)? (valorcomDesc-((0.85 * 100)/valorcomDesc)) : valorcomDesc + 0;
        //Função para calcular o frete
        UnaryOperator<Double> valorFrete = valorSfrete ->
                (valorSfrete >= 3000)? valorSfrete + 100 : valorSfrete + 50;
        //Arredondando Valor
        Function<Double,String> arredondado =
                valorTotal -> new DecimalFormat("#,##0.00").format(valorTotal);
        //

        Produto produto = new Produto("iPad", 3235.89, 0.13);

        String valorIpad1 = valorDesc.andThen(valorImpos).andThen(valorFrete).
                andThen(arredondado).apply(produto);

        System.out.println(valorIpad1);

    }
}
