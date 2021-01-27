package OO.Composição.Muitos_Muitos;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Alexandre");
        Aluno aluno2 = new Aluno("Thiago");
        Aluno aluno3 = new Aluno("Messias");

        Curso curso1 = new Curso("Excel Completo 2021");
        Curso curso2 = new Curso("Banco de Dados");
        Curso curso3 = new Curso("Programação Web");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso1.adicionarAluno(aluno3);

        aluno1.adicionarCursos(curso2);
        aluno2.adicionarCursos(curso2);
        aluno3.adicionarCursos(curso2);

        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Sou aluno do "+curso1.nome+"...");
            System.out.println("...Meu nome é "+aluno.nome);
            System.out.println("\n");
        }

        Curso cursoEncotrado = aluno1.filtroCurso("Excel Completo 2021");

        if(cursoEncotrado != null){ System.out.println(cursoEncotrado.alunos); }
    }
}
