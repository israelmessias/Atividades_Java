package Collections.List;
import java.util.ArrayList;
import java.util.List;


public class Lista {
    public static void main(String[] args) {
        List <Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Thiago"));
        lista.add(new Usuario("Roberta"));
        lista.add(new Usuario("Sandra"));

        System.out.println(lista.get(1));//Ohar um elemento da lista pelo indice
        System.out.println(lista.remove(1));//Remove elemento pelo indice
        System.out.println(lista);

        lista.add(new Usuario("Yago"));

        for (Usuario pessoa: lista){
            System.out.println(pessoa);
        }
    }

}
