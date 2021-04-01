package Tratamento_de_Erro.PersonalizadaB;

import Tratamento_de_Erro.Aluno;

public class Validar {
    public static void Aluno(Aluno aluno) throws NumeroForaDoIntervalo {
        if (aluno == null){
            throw new IllegalArgumentException("O aluno esta nulo!");
        }
        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVazio("nome");
        }
        if(aluno.nota < 0 || aluno.nota >10 ){
            throw new NumeroForaDoIntervalo("nota");
        }
    }
}
