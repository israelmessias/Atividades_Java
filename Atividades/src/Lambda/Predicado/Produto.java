package Lambda.Predicado;

public class Produto {
    final String nome;
    final double preço;
    final double desconto;

    public Produto(String nome, double preço, double desconto) {
        this.nome = nome;
        this.preço = preço;
        this.desconto = desconto;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        double preçoFinal = preço - desconto;
        return nome+" Preço: R$ "+preçoFinal;
    }
}
