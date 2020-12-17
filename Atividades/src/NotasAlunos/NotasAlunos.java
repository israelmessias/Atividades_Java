package NotasAlunos;
import java.util.Arrays;

public class NotasAlunos {
    public static void main(String[] args) {
        //Primeiro seleciona o tipo da variavel, apos isso instacia o "objeto" com a quantidade de elementos na array
        float[] aluno = new float[3];
        aluno[0] = 7.5f;
        aluno[1] = 6.5f;
        aluno[2] = 8.9f;

        //System.out.println(Arrays.toString(aluno));
        //System.out.println(aluno[2]);

        //
        float total = 0;
        //length comprimento da array,  ou seja, i vai até o comprimento da array
        for(int i = 0; i < aluno.length; i++){
            //A variavel i vai chegar até o terceiro indice
            total += aluno[i];
        }
        //
        float media = (total/aluno.length);
        System.out.println(media);


        float[] aluno2 = {6.6f, 5.7f, 8.5f, 9.8f};
        float total2 = 0;
        for (int i = 0; i < aluno2.length; i++){
            total2 += aluno2[i];
        }

        float media2 = (total2/aluno2.length);
        System.out.println(media2);

    }
}
