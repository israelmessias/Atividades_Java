package Array;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayAtividade {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int[] array = new int[10];// de 10 posições
        for (int i = 0; i < array.length; i++) {// Este for perguntara o valor de cada indice
            System.out.println("Digite um valor " + (i + 1) + ":");
            array[i] = input.nextInt();
        }
        int indice = 0;
            for (int arrays:array) {
                System.out.println("Indice: " + indice++ + " -> " + Arrays.toString(new int[]{arrays}));
        }

    }
}


