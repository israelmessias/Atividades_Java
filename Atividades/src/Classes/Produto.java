package Classes;

public class Produto {
    //Produtos
    String nome;
    double preço, desconto;
    //Novo Construtor
    Produto(String nomeDoProduto){
        nome = nomeDoProduto;
    }
     //Metodo
    double preçoComDesconto(){
        return preço * (1 - desconto);
    }
    //Metodo
    double preçoComDescontoEsp(double descontoDoGerente){
        return preço * (1 - desconto + descontoDoGerente);
    }

}
