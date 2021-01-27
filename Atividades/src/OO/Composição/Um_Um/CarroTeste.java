package OO.Composição.Um_Um;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        //Para saber se o carro esta ligado
        System.out.println(c1.estaLigado());
        //Liga o carro
        c1.ligar();
        System.out.println(c1.estaLigado());
        //Quantidade de giros do carro
        System.out.println(c1.motor.giros());
        //Acelerar o carro

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        //Frear

        c1.frear();
        c1.frear();
        c1.frear();
    }
}
