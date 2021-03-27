package Tratamento_de_Erro.PersonalizadaB;

import Tratamento_de_Erro.Aluno;

public class TestesValidações {
    public static void main(String[] args) {

        try{
            Aluno aluno = new Aluno("", 17);
            Validar.Aluno(aluno);
            Validar.Aluno(null);;
        } catch (StringVazio | NumeroForaDoIntervalo | IllegalArgumentException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        } 
        
        System.out.println("Fim :");
    }

}
