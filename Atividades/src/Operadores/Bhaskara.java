package Operadores;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Formula de Bhaskara
        float a, b, c, Δ, x1, x2;

        System.out.println("#-----#-----#-----#------#-----#-----#-----#");
        System.out.println("Digite o valor de a:\t");
        a = input.nextFloat();
        System.out.println("Digite o valor de b:\t");
        b = input.nextFloat();
        System.out.println("Digite o valor de c:\t");
        c = input.nextFloat();
        //Apos declarar o valor de a,b e c é feito o calculo de delta || Math.pow() faz calulos de potenciação
        Δ = (float) Math.pow(b, 2) - 4*a*c;
        //Caso delta seja maior que 1 sera feito a formula de Bhaskara
        if(Δ >= 1){

            x1 = (float) (-b + Math.sqrt(Δ));
            x2 = (float) (-b - Math.sqrt(Δ));
            System.out.println("#-----#-----#-----#------#-----#-----#-----#");
            System.out.println("\t\t\tFormula de Bhaskara\nx = -b±√Δ\n");
            System.out.println("x = -"+b+"+"+Math.sqrt(Δ)+
                    "="+x1);
            System.out.println("\nx = -"+b+"-"+Math.sqrt(Δ)+
                    "="+x2);
        }
        //Caso delta seja igual a zero não se faz a formula de Bhaskara
        else if(Δ == 0)
            System.out.println("Valor de Δ é 0");
            //Se o valor de delta for negativo tambem não sera feita a formula de Bhaskara
        else
            System.out.println("Valor de Δ é:"+Δ);
    }
}
