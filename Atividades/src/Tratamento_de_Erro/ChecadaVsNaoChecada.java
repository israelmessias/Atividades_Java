package Tratamento_de_Erro;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim...");
    }
    //Não verificada
    static void geraErro1(){
        //throw lança uma exceção
        throw new RuntimeException("Ocorreu um erro #01!");
    }

    //Exeção verificada
    /*

    */
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro #02!");
    }
}
