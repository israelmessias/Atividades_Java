package OO.Herança.Enum.Carro;

public class Carro {
    int VELOCIDADE_MAXIMA;
    //O estado atual da velocidade do carro
    int velocidadeAtual;
    //A variação da velocidade é de 5km
    int delta = 5;
    Carro(int velocidade_maxima){
        VELOCIDADE_MAXIMA = velocidade_maxima;
    }

    //Sempre que for acelerar a velocidade aumentar 5 km/h
    void acelerar(){
        velocidadeAtual += delta;
    }
    //Frear
    void frear(){
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