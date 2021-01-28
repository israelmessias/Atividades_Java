package OO.Composição.DesafioComposiçao;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Thiago");
        Compra compra1 = new Compra();
        compra1.adicionarIntem("Macarrão", 5.25, 6);
        compra1.adicionarIntem("Veja Limpeza Total", 4.25, 4);
        Compra compra2 = new Compra();
        compra2.adicionarIntem("Notebook", 2625.20, 1);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);
        System.out.println(cliente.toString());

    }
}
