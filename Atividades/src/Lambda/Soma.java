package Lambda;

public class Soma {
    public static void main(String[] args) {
        Calculo soma = (x, y) -> {return x + y;};
        Calculo subtração = (x, y) -> {return x - y;};
        Calculo multiplicação = (x, y) -> {return x * y;};
        Calculo divisão = (x, y) -> {return x / y;};

        double c1 = soma.execução(25, 55) - multiplicação.execução(5, 7);

        System.out.println(c1);

        double c2 = soma.execução(25, 7) / divisão.execução(75, 7);
        
        System.out.println(Math.round(c2));

        double c3 = subtração.execução(25, 45) * multiplicação.execução(55, 7);

        System.out.println(c3);
    }
}
