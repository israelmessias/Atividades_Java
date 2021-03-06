package OO.Herança.Enum.Carro;

 public class Carro {
   final  public int VELOCIDADE_MAXIMA;
    //O estado atual da velocidade do carro
    int velocidadeAtual;

     //A variação da velocidade é de 5km
    protected int delta;
    //Construtor vai ser usado como para
    protected Carro(int velocidade_maxima){
        VELOCIDADE_MAXIMA = velocidade_maxima;
    }
     //Sempre que for acelerar a velocidade aumentar 5 km/h
    public void acelerar(){
        velocidadeAtual += getDelta();
    }
    //Frear
    public void frear(){
        //A velocidade Atual tem que ser menor ou igual a velocidade maxima
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA)
            velocidadeAtual = VELOCIDADE_MAXIMA;
        else
            velocidadeAtual += getDelta();
    }
    //
    public String toString(){
        return"A velocidade atual do carro é "+ velocidadeAtual+"km/h";
    }
    //
     public void setDelta(int delta) {
         this.delta = delta;
     }
     //
     public int getDelta() {
         return delta;
     }
}