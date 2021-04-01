package Generics.ComGenerics;

public class CaixaIntTest {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt<Integer>();
        caixaA.guardar(123);
        caixaA.abrir();

        System.out.println(caixaA);
    }
}
