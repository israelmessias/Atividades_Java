package OO.Herança.Enum.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Civic civic = new Carro();
        civic.acelerar();
        System.out.println(civic);

        Ferrari ferrari = new Carro();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);
    }
}
