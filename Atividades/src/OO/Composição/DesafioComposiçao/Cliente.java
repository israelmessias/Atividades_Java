package OO.Composição.DesafioComposiçao;
import java.util.ArrayList;

public class Cliente {
    final String nome;
    final ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome){this.nome = nome;}

    Double obterValorTotal(){
        double total = 0;
        for(Compra compraAtual: compras){total += compraAtual.obterValorTotal();}
        return total;
    }

    @Override
    public String toString() {
        return "O valor total das compras de "+nome+" foi R$"+obterValorTotal();
    }
}
