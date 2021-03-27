package Tratamento_de_Erro.PersonalizadaB;

@SuppressWarnings("serial")
public class StringVazio extends RuntimeException{
    private String nomeDoAtributo;

    public StringVazio(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }


    public String getMessage() {
        return "O atributo " +nomeDoAtributo+ " está vazio!";

    }
}
