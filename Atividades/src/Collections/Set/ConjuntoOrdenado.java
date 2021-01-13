package Collections.Set;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrdenado {
    public static void main(String[] args) {
        Set <String> ListaAprovados = new HashSet();//Conjunto

        ListaAprovados.add("Beatriz");
        ListaAprovados.add("Agatha");
        ListaAprovados.add("Thiago");
        ListaAprovados.add("Sandro");
        ListaAprovados.add("João");
        ListaAprovados.add("Janaina");

        for(Object candidato: ListaAprovados){
            System.out.println("Candidato: "+ candidato);
        }

        Set <String> NovosCandidatos = new TreeSet<>();

        NovosCandidatos.add("Pamela");
        NovosCandidatos.add("Augusto");
        NovosCandidatos.add("Italo");
        NovosCandidatos.add("Thaina");

        System.out.println("\n\n");

        for(String candidato: NovosCandidatos){
            System.out.println("Novo Candidato "+candidato);
        }
    }
}
