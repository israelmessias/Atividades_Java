package OO.Composição.ParaMuitos;

public class CompraTest {
    public static void main(String[] args) {
        var c1 = new Compra();
        c1.cliente = "Lucas Menezes";
        c1.intens.add(new Intem("Mouse", 2, 20.59));
        c1.intens.add(new Intem("Teclado", 1, 31.59));
        c1.intens.add(new Intem("Monitor", 1, 315.99));

        System.out.println(c1.toString());
    }
}
