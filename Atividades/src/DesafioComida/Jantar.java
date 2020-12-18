package DesafioComida;

public class Jantar {
    public static void main(String[] args) {
        var joão = new Pessoa("João", 78.5f);
        joão.comeu.nomeDaComida = "Arroz e Feijão";
        joão.comeu.pesoDaComida = 0.30f;
        System.out.println(joão.estadoDaPessoa());

        var maria = new Pessoa("Maria", 62.05f);
        maria.comeu.nomeDaComida = "Lasanha";
        maria.comeu.pesoDaComida = 0.65f;
        System.out.println(maria.estadoDaPessoa());

        var samuel = new Pessoa("Samuel", 69.25f);
        samuel.comeu.nomeDaComida = "Pastelão";
        samuel.comeu.pesoDaComida = 55.50f;
        System.out.println(samuel.estadoDaPessoa());

    }
}
