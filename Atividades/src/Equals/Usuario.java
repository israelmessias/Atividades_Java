package Equals;

public class Usuario {
    String nome, email;
//
    //
    public boolean equals (Object objeto){
        Usuario outro = (Usuario) objeto;
        if(objeto instanceof Usuario){
            //
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }
        else{
            return false;
        }

    }
}
