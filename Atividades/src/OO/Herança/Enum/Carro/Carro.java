package OO.Herança.Enum.Carro;

 public class Carro {
    public int VELOCIDADE_MAXIMA;
    //O estado atual da velocidade do carro
    public int velocidadeAtual;
    //A variação da velocidade é de 5km
     protected int delta = 5;
     Carro(int velocidade_maxima, int delta_ferrari){
        VELOCIDADE_MAXIMA = velocidade_maxima;
        delta_ferrari = delta;
    }
     //Sempre que for acelerar a velocidade aumentar 5 km/h
    public void acelerar(){
        velocidadeAtual += delta;
    }
    //Frear
    public void frear(){
        //A velocidade Atual tem que ser menor ou igual a velocidade maxima
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA)
            velocidadeAtual = VELOCIDADE_MAXIMA;
        else
            velocidadeAtual += delta;
    }
    public String toString(){
        return"A velocidade atual do carro é "+ velocidadeAtual+"km/h";
    }
}