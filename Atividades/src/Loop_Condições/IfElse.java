package Loop_Condições;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome1 = "João";
        int idade1;
        System.out.println("Digite a idade de "+nome1+":\t");
        idade1 = input.nextInt();

        //Caso a idade de João varie de 0 a 3 anos ele é um bebe
        if (idade1 > 0 && idade1 < 4)
            System.out.println(nome1 + " é um bebe");
            //Caso a idade de João varie de 4 a 9 anos ele é uma criança
        else if (idade1 >= 4 && idade1 < 10)
            System.out.println(nome1 + " é uma criança");
            //Caso a idade de João varie de 10 a 12 anos ele é um pre-adolescente
        else if (idade1 >= 11 && idade1 < 13)
            System.out.println(nome1+" é um Pré - Adolescente");
            //Caso a idade de João varie de 13 a 17 anos ele é um adolescente
        else if (idade1 >= 14 && idade1 <18)
            System.out.println(nome1+" é um adolescente");
            //Caso a idade de João varie de 18 a 64 anos ele é um adulto
        else if (idade1 >= 18 && idade1 <65)
            System.out.println(nome1+" é um adulto");
            //Caso a idade de João seja maior que 65 anos
        else if(idade1 >= 65)
            System.out.println(nome1+" é um idoso");
    }
}
