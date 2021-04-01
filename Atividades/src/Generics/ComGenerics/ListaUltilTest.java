package Generics.ComGenerics;

import java.util.Arrays;
import java.util.List;

public class ListaUltilTest {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
        List<Integer> nums = Arrays.asList(1 , 2, 3, 4, 5, 6);

        String ultimalinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimalinguagem);//C++

        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);//6

        /*
        Essa variaveis abaixo foram não precisaram de cast, pois foi usada generic.
        */
        String ultimalinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimalinguagem2);//C++

        Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNumero2);//6
    }
}
