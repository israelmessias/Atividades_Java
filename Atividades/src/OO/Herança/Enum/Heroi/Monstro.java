package OO.Herança.Enum.Heroi;

public class Monstro extends Jogador{
    //
    public Monstro(int x, int y){
        super(x, y);
    }

   public boolean ataqueEspecial(Jogador oponente){
        int diferençaX = Math.abs(x - oponente.x);
        int diferençaY = Math.abs(y - oponente.y);

        if(diferençaX == 0 && diferençaY == 1){
            oponente.vida -=19;
        }else if(diferençaX == 1 && diferençaY == 0){
            oponente.vida -= 15;
        }
        return true;
    }
}
