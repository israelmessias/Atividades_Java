package Lambda.Predicado.Composição;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Predicate;

public class PredicadoComposição {
public static void main(String[] args) {
        
    Predicate<Integer> isPar =
       num -> num % 2 == 0;
    Predicate<Integer>isTresDigitos =
       num ->num >= 100 && num <= 999;
    /*A função isTresDigitos compõe o isPar, sendo assim o test para
     ser true tem passar pelo parametro das duas funções,
     mas o negate contraria o resultado do test
     */
    System.out.println(isPar.and(isTresDigitos).negate().test(123));
}
    
    
}
