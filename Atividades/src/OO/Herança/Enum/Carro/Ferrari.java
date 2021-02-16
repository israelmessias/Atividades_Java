package OO.Herança.Enum.Carro;

public class Ferrari extends Carro{
    //Essa anotação serve para rescrever um metodo
    @Override
    Ferrari(int velocidade_maxima){
        super.VELOCIDADE_MAXIMA = 340;
    }
    void acelerar(){
        velocidadeAtual += 15;
    }
}
