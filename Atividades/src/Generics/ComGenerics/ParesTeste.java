package Generics.ComGenerics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Pedro");
        resultadoConcurso.adicionar(3, "Gui");
        resultadoConcurso.adicionar(4, "Ana");
        resultadoConcurso.adicionar(2, "Rebeca");

        System.out.println(resultadoConcurso.getValor(1));//Maria
        System.out.println(resultadoConcurso.getValor(4));//Ana
        /*
        A classe Pares utiliza Set que não aceita repetição, por isso Rebeca substitui Pedro
        */
        System.out.println(resultadoConcurso.getValor(2));//Rebeca
    }
}
