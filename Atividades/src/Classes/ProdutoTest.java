package Classes;

import data.Data;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var p1 = new Produto("Lata de Ervilha");
        p1.preço = 3.10;
        p1.desconto = 0.55;
        double oferta_de_desconto = -2.00;
        System.out.println(p1.preçoComDescontoEsp(oferta_de_desconto));
        Produto p2 = new Produto("Macarrão");
        p2.preço = 3.05;
        p2.desconto = 0.85;
        p2.preçoComDesconto();
        

    }
}
