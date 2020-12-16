package Loop_Condições;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valor2 = "";

        do{
            System.out.println("Diga as palavras magicas: ");
            valor2 = input.nextLine();

        }while (!valor2.equalsIgnoreCase("por favor!"));
        input.close();
    }
}
