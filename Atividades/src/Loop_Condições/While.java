package Loop_Condições;

public class While {
    public static void main(String[] args) {
        int contador = 1; //variavel contador

        //Oi ira repetir enquanto contador for menor igual a 10
        while (contador <= 10) {
            System.out.println("oi");
            //incremento na variavel contador
            contador++;
        }
        var contador2 = 1;


        while (contador2 <= 20) {
            System.out.printf("i = %d igual a: \n",
                    contador2);
            contador2++;
        }
    }
}
