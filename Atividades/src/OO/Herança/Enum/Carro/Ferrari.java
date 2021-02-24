package OO.Herança.Enum.Carro;

public class Ferrari extends Carro implements Esportivo{
    //Essa anotação serve para rescrever um metodo

    public Ferrari(){this(340);}
    public Ferrari(int velocidade_maxima){
      super.velocidadeAtual = VELOCIDADE_MAXIMA;
      delta = 15;
    }
   /* @Override
    public void acelerar(){
       delta = 15;
    }*/

    @Override
    public void ligarTurbo() {
        delta = 35;
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
    }
}
