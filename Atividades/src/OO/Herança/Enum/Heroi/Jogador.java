package OO.Herança.Enum.Heroi;

public class Jogador {
    //x e y
    public int x, y;
    public int vida = 100;
    //modifiquei o construtor padrão
    protected Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador oponente){
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
    public boolean andar(Direção direção) {
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
