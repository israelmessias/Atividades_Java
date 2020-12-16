package Tipos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // O tipo de dados é um inteiro de complemento de dois de 8 bits assinado.
        // Tem um valor mínimo de -128 e um valor máximo de 127 (inclusive).
        byte tipo1 = 5;

        //O tipo de dados é um inteiro de complemento de dois de 16 bits assinado.
        // Tem um valor mínimo de -32.768 e um valor máximo de 32.767 (inclusive).
        short tipo2 = 90;

        //Por padrão, o tipo de dados é um inteiro de complemento de dois bits assinado de 32 bits,
        // que tem um valor mínimo de -231 e um valor máximo de 231-1.
        int tipo3 = 500;

        // O tipo de dados é um inteiro de complemento de 64 bits.
        // O longo assinado tem um valor mínimo de -263 e um valor máximo de 263-1.
        long tipo4 = -5222222222222222222L;

        //É um tipo de valores reais, o valor minimo -3,4028E + 38 e o valor maximo -3,4028E + 38
        float tipo5 = 2.568f;

        //É um tipo de valores reais, o valor minimo -1,7976E + 308 e o maximo é 1,7976E + 308
        double tipo6 = -5.6668582231d;

        // O tipo de dados é um único caractere Unicode de 16 bits.
        // Tem um valor mínimo (ou 0) e um valor máximo de (ou 65.535 inclusive).
        char tipo7 = 'o';

        //O tipo de dados tem apenas dois valores possíveis: e .
        // Use este tipo de dados para bandeiras simples que rastreiam condições verdadeiras/falsas.
        boolean tipo8 = true;
    }
}
