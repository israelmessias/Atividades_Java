package Lambda.Fornecedor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        //Quando uma função não tem parametros usa parenteses
        Supplier<List<String>> umLista =
                () -> Arrays.asList("Ana", "Ary", "Roberto", "Riana");


        System.out.println(umLista.get());
    }
}
