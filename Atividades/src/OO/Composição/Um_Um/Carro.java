package OO.Composição.Um_Um;

public class Carro {
    Motor motor = new Motor();

    void acelerar(){
        motor.fatorDeInjeção += 0.4;
    }
    void frear(){
        motor.fatorDeInjeção -= 0.4;
    }
    void ligar(){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }
    boolean estaLigado(){
        return motor.ligado;
    }

}
