package Generics.ComGenerics;
import java.util.HashSet;
import java.util.Optional;
import  java.util.Set;

public class Pares<C extends Number, V> {

    private final Set<Par<C, V>> intens = new HashSet<>();

    public void adicionar(C chave, V valor){
        if(chave == null) return;//Esse return vazio sai do metodo

        Par<C, V> novoPar = new Par<C, V>(chave, valor);

        if(intens.contains(novoPar)){
            intens.remove(novoPar);
        }
        intens.add(novoPar);

    }

    public V getValor(C chave){
        if(chave == null) return null;
         Optional<Par<C, V>> parOptional = intens.stream().
                filter(p -> chave.equals(p.getChave())).findFirst();

         return parOptional.isPresent() ?
                 parOptional.get().getValor() : null;
    }
}
