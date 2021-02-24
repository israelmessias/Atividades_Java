package OO.Herança.Enum.Testes;

import OO.Herança.Enum.Heroi.Direção;
import OO.Herança.Enum.Heroi.Heroi;
import OO.Herança.Enum.Heroi.Monstro;

public class Jogo {
    public static void main(String[] args) {
        /* Primeiro teste
        Jogador j1 = new Jogador();
        /*j1.y = 20;
        j1.x = 10;

        j1.andar(Direção.NORTE);
        j1.andar(Direção.NORTE);
        j1.andar(Direção.NORTE);
        j1.andar(Direção.NORTE);

        System.out.println(j1.y);*/

        //Posição dos Jogadores
        Heroi manoel = new Heroi(10, 12);
      //  manoel.x = 10;
      //  manoel.y = 12;

        //Posição do monstro
        Monstro dracula = new Monstro(10,13);
        //dracula.x = 10;
        //dracula.y = 13;
        //Thiago esta acima de Manoel

        System.out.println("A vida de Manoel é:"+manoel.vida+"\n\nA vida de Dracula é:"+dracula.vida);
        //Manoel ataca e tira 10 pontos de Manoel
        manoel.atacar(dracula);

        System.out.println("Manoel atacou Dracula, o status de vida dos dois é\n\n\t\tManoel"+manoel.vida+"\n\t\tDracula"+dracula.vida);
        //Dracula da um ataque especial pelo eixo x e tira 19 pontos || Manoel atacou Dracula e tirou 10 pontos dele
        dracula.ataqueEspecial(manoel);
        manoel.atacar(dracula);

        System.out.println("Manoel tem => "+manoel.vida+"\nDracula tem => "+dracula.vida);
        //Dracula da um ataque especial pelo eixo x e tira 19 pontos || Manoel da um ataque especial e tira 23 pontos
        dracula.ataqueEspecial(manoel);
        manoel.ataqueEspecial(dracula);

        System.out.println("Manoel tem => "+manoel.vida+"\nDracula tem => "+dracula.vida);
        //Dracula anda ao Leste || Manoel anda ao Leste duas vezes e depois ao sul, apos isso da um ataque especial no dracula pelo eixo Y e tira 20 pontos
        dracula.andar(Direção.LESTE);
        manoel.andar(Direção.LESTE);
        manoel.andar(Direção.LESTE);
        manoel.andar(Direção.SUL);
        manoel.ataqueEspecial(dracula);

        System.out.println("Manoel tem => "+manoel.vida+"\nDracula tem => "+dracula.vida);
        /*System.out.println("Posição Manoel=>"+manoel.x + manoel.y+"\nPosição Dracula "+dracula.x + dracula.y);
         Teste para saber a posição*/
    }
}
