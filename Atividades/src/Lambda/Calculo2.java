package Lambda;

import java.util.function.BinaryOperator;

public class Calculo2 {
    public static void main(String[] args) {
        //O BinaryOperator substitui a interface funcional 
        BinaryOperator<Double> calc = (x, y) -> {return x*y;};

        System.out.println(calc.apply(25.0, 3.0));
    }
    
}
