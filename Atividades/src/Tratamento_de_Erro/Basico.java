package Tratamento_de_Erro;

import OO.Composição.Muitos_Muitos.Aluno;

public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;
        /*
        O try instrução permite definir um bloco de código a ser testado quanto a erros enquanto está sendo executado.
        O catch instrução permite definir um bloco de código a ser executado, se ocorrer um erro no bloco try.
        */
        try {
            imprimirAluno(a1);
        } catch (Exception exeção){
            System.out.println("Ocorreu um erro ao imprimir o nome do usuario");
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: "+ e.getMessage());
        }
        System.out.println("Fim...");
    }
    public static void imprimirAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
