package Tratamento_de_Erro;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        try {
            System.out.println(7 / input.nextInt());
        } catch (OutOfMemoryError e) {//O OutOfMemoryError Não trata o erro, mas continua o Finally
            //TODO: handle exception
            System.out.println(e.getMessage());
        }finally{
            /*O finally diz que o trecho de codigo deve ser executado,
             mesmo que ocorra algum erro, ou corra tude bem.*/
            System.out.println("Finalmente...");
            input.close();
        }

        System.out.println("Fim...");
    }
}
