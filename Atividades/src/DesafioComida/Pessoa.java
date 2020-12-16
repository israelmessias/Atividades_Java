package DesafioComida;

public class Pessoa {
    //Atributos da classe Pessoa nome e peso
    String pessoa;
    float pesoDaPessoa;

    Pessoa(String pessoa, float pesoDaPessoa){
        this.pessoa = pessoa;
        this.pesoDaPessoa = pesoDaPessoa;
    }
    //Instaciei a classe comida
    Comida comeu = new Comida();
    //Metodo para calcular o peso da comida + peso da pessoa
    float novoPeso() {
        float pesoAtual = 0;
        if (comeu != null) {
            pesoAtual = pesoDaPessoa + comeu.pesoDaComida;
        }
        return pesoAtual;
    }
    //Imprimir o Antigo peso da pessoa e o atual
    String estadoDaPessoa(){
        return String.format("%s pesava %f, mas apos comer %s passou a pesar %f", pessoa, pesoDaPessoa, comeu.nomeDaComida, (Object) novoPeso());
    }
}
