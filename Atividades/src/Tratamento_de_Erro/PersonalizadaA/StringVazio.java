package Tratamento_de_Erro.PersonalizadaA;

@SuppressWarnings("serial")
public class StringVazio extends Exception{
    private String nomeDoAtributo;

    public StringVazio(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }


    public String getMessage() {
        return "O atributo " +nomeDoAtributo+ " está vazio!";

    }
}
