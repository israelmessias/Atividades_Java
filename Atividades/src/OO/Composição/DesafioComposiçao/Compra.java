package OO.Composição.DesafioComposiçao;
import java.util.ArrayList;

public class Compra {
    final ArrayList<Intem> intens = new ArrayList<>();

    void adicionarIntem(Produto produto, int quantidade){
        //
        this.intens.add(new Intem(produto, quantidade));
    }

    double obterValorTotal(){
        double total = 0;
        for(Intem intem: intens){total += intem.quantidade * intem.produto.preco;}
        return total;
    }
}
