package Tratamento_de_Erro.PersonalizadaA;

import Tratamento_de_Erro.Aluno;

public class TestesValidações {
    public static void main(String[] args) throws NumeroForaDoIntervalo, StringVazio, IllegalArgumentException{

        try{
            Aluno aluno = new Aluno("", 17);
            Validar.Aluno(aluno); 
            Validar.Aluno(null);
            
        } catch (StringVazio | NumeroForaDoIntervalo | IllegalArgumentException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        } 

        Validar.Aluno(null);
        
        System.out.println("Fim :");
    }

}
