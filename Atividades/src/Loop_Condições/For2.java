package Loop_Condições;

public class For2 {
    public static void main(String[] args) {
        // variavel par começa com o valor 10, tem que terminar com o valor 0 e vai decrementar como o valor 2
        for(int par = 10; par >= 0; par -= 2){
            System.out.printf("i = %d\n", par);
        }
        //i tem que terminar igual a 0, terminar a 60 e incrementar com o valor 3
        for (int i = 0; i <= 60; i += 3)
            System.out.println("\n"+i+"\n");
    }
}
