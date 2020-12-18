package DesafioArray;
import java.util.Arrays;//
import java.util.Scanner;//

public class DesafioArray {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int quantNotas;
        System.out.println("Digite quantidades de notas: ");
        quantNotas = input.nextInt();

        float[] nota = new float[quantNotas];

        for(int i = 0; i < nota.length; i++){
            System.out.println("Digite o valor da nota "+(i+1)+":");
            nota[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nota));
    }
}
