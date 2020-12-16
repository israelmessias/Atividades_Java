package Loop_Condições;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "";

        System.out.println("Digite seu nome:\t");
        nome = input.nextLine();

        switch(nome){
            case "Israel":
                System.out.println("Bom dia");
                break;
            case "Thiago":
                System.out.println("Boa tarde");
                break;
            case "Roberto":
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Tente outro nome...");

        }
    }
}
