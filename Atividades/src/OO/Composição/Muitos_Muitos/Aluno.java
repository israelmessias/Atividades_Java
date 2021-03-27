package OO.Composição.Muitos_Muitos;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    public final String nome;
    public final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome){this.nome = nome;}
    Curso filtroCurso(String nome){
        for(Curso curso: this.cursos){
            if (curso.nome.equalsIgnoreCase(nome)) {return curso;}
        }
        return null;
    }
    //Relação Bidirecional, ou seja um aluno participa de um curso e um curso pode ter aluno
    void adicionarCursos(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
    public String toString(){ return nome; }

}
