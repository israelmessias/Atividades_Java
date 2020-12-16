package Loop_Condições;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valor = "";


        //Enquanto a string sair não for usada como entrada na variavel valor essa função ira se repitir
        while(!valor.equalsIgnoreCase("sair")) {
            System.out.println("Você diz: ");
            valor = input.nextLine();

        }
        input.close();
    }
}
