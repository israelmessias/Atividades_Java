package OO.Encapsulamento.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa();
        ana.setIdade(-50);
        System.out.println(ana.getIdade());
        ana.setNome("Ana Maria");
        System.out.println(ana);
    }
}
