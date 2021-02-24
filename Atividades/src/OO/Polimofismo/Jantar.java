package OO.Polimofismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(78.25);
        Feijão ingrediente1 = new Feijão(0.45);
        Arroz ingerdiente2 = new Arroz(0.25);

        convidado.comer(ingerdiente2);
        convidado.comer(ingrediente1);

        System.out.println(convidado.getPeso());

        Soverte sobremesa = new Soverte(0.15);

        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());

    }
}
