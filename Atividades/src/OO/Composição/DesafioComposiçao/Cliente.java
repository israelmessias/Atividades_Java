package OO.Composição.DesafioComposiçao;
import java.util.ArrayList;

public class Cliente {
    final String nome;
    final ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome){this.nome = nome;}

    double obterValorTotal(){
        double total = 0;
        for(Compra compraAtual: compras){total += compraAtual.obterValorTotal();}
        return total;
    }


}
