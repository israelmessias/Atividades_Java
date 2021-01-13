package Collections.Set;
import java.util.HashSet;

public class ConjuntoBagunçado {
    public static void main(String[] args) {
        // Aceita um conjunto de Objetos
        HashSet conjunto = new HashSet();

        conjunto.add("ola"); //String
        conjunto.add(25); //Integer
        conjunto.add(55.658); //Double

        conjunto.remove(25);//Remove o objeto

        System.out.println(conjunto);

        conjunto.add('s'); //Character
        System.out.println(conjunto);
        System.out.println(conjunto.contains("One Piece"));
        System.out.println(conjunto.contains('s'));// Revela se existe o objeto dentro do conjunto
        System.out.println(conjunto.size());//Quantidade de Objetos
    }
}
