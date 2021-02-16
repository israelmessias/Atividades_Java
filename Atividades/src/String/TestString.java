package String;

public class TestString {
    public static void main(String[] args) {
        //.replace() serve para trocar String
        java.lang.String frase1 = "Oi eu sou Tevez";
        java.lang.String troca = frase1.replace("Tevez", "Goku");
        System.out.println(troca);

        //.concat() serve para adicionar uma String dentro de uma String
        java.lang.String frase2 = "O Naruto pode ser um pouco duro as vezes,";
        java.lang.String adicionar = frase2.concat(" mas ele tambem nasceu sem pai...");
        System.out.println(adicionar);

        //.toUpperCase() serve para tornar as Strings aumentativo
        java.lang.String frase3 = "eu sou monkey d. luffy, e serei o rei dos piratas!!!";
        java.lang.String aumentativo = frase3.toUpperCase();
        System.out.println(aumentativo);

        //.toLowerCase() server para tornar a String no diminutivo
        java.lang.String frase4 = "GRANDE DIA!!!";
        java.lang.String diminuitivo = frase4.toLowerCase();
        System.out.println(diminuitivo);

    }
}
