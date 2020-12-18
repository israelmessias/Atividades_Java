package DesafioArray;
import java.util.Arrays;//
import java.util.Scanner;//

public class DesafioArray {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int quantNotas;
        System.out.println("Digite quantidades de notas: ");
        quantNotas = input.nextInt();
        //O tamanho da Array vai o valor da quantNotas
        float[] notas = new float[quantNotas];
        //Esse for ira perguntara o valor da nota de acordo com valor da variavel notas
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite o valor da nota "+(i+1)+":");
            notas[i] = input.nextInt();
        }
        //
        float total = 0;
        for(float nota:notas) {
        	total += nota;
        }
        //media das notas, por total/notas
       float media = total/notas.length;

        System.out.println("A media é: "+ media);
    }
}
