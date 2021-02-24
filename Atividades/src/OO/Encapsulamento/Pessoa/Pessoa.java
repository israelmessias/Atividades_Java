package OO.Encapsulamento.Pessoa;

public class Pessoa {
    private String nome;
    private int idade = 30;

    //Metodo para ler a idade de um atributo privado
    public int getIdade() {//Getter
        return idade;
    }

    //Esse metodo muda a idade da pessoa, porem não deixa ser menor que 0 e maior que 120
    public void setIdade(int novaIdade) {//Setter
        novaIdade = Math.abs(novaIdade);
        if (idade >= 0 && idade < 120) {
            this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

}
