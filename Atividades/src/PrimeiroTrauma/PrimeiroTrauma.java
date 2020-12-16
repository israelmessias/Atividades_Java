package PrimeiroTrauma;

public class PrimeiroTrauma {
    int a = 3;
    static int b = 5;

    public static void main(String[] args) {
        //Tem que instancia
        PrimeiroTrauma p = new PrimeiroTrauma();
        System.out.println(p.a);
        //Se a varavel for estatica da para acessar
        System.out.println(b);
    }
}
