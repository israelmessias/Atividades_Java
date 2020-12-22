package Foreach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Foreach {
    public static void main(String[] args) {

        float[] notas = {9.9f, 9.8f, 7.2f, 9.4f};
        //for a varaiavel nota vai percorrer toda array
        for (float nota: notas){
            System.out.println(Arrays.toString(new float[]{nota}));
        }
    }
}
