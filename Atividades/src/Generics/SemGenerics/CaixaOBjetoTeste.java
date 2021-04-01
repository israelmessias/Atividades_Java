package Generics.SemGenerics;

public class CaixaOBjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.aguardar(2.3);//double -> Double

        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);


        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.aguardar("Ola");//double -> Double

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisa);
    }


}
