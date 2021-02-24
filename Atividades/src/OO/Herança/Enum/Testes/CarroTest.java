package OO.Herança.Enum.Testes;

import OO.Herança.Enum.Carro.Carro;
import OO.Herança.Enum.Carro.Civic;
import OO.Herança.Enum.Carro.Ferrari;

public class CarroTest{
    public static void main(String[] args) {
        Carro civic = new Civic();
        civic.acelerar();
        System.out.println(civic);

        Ferrari ferrari = new Ferrari();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);


    }
}
