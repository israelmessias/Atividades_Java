package OO.Composição.ParaMuitos;
import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Intem> intens = new ArrayList<Intem>();

    double ValorTotal(){
        double total = 0;
        for(Intem intem: intens){
            total += intem.quantidade * intem.preço;
        }
        return total;
    }

    @Override
    public String toString() {
        return "\n\nO valor total das compras é: R$ " +
                ValorTotal()+"\n\n";
    }
}
