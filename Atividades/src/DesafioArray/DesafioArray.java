package DesafioArray;
import java.util.Arrays;//
import java.util.Scanner;//

public class DesafioArray {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int quantNotas;
        System.out.println("Digite quantidades de notas: ");
        quantNotas = input.nextInt();

        float[] notas = new float[quantNotas];

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite o valor da nota "+(i+1)+":");
            notas[i] = input.nextInt();
        }
        float total = 0;
        for(float nota:notas) {
        	total += nota;
        }
       float media = total/notas.length;

        System.out.println("A media é: "+ media);
    }
}
