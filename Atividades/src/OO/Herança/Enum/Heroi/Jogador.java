package OO.Herança.Enum.Heroi;

public class Jogador {
    //x e y
    int x, y;
    int vida = 100;
    //modifiquei o construtor padrão
    Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador oponente){
        //
        int diferençaX = Math.abs(x - oponente.x);
        int diferençaY = Math.abs(y - oponente.y);

        if(diferençaX == 0 && diferençaY == 1){
            oponente.vida -=10;
        }else if(diferençaX == 1 && diferençaY == 0){
            oponente.vida -= 10;
        }
        return true;
    }
    boolean andar(Direção direção) {
        switch (direção) {
            case NORTE:
                x--;
                break;
            case LESTE:
                y++;
                break;
            case SUL:
                x++;
                break;
            case OESTE:
                y--;
                break;
        }
        return true;
    }
}
