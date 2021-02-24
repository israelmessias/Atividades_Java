package OO.Herança.Enum.Heroi;
//
public class Heroi extends Jogador{
    //coloquei parametros no construtor padrão
    public Heroi(int x, int y){
        super(x, y);
    }
    public boolean ataqueEspecial(Jogador oponente){
        int diferençaX = Math.abs(x - oponente.x);
        int diferençaY = Math.abs(y - oponente.y);

        if(diferençaX == 0 && diferençaY == 1){
            oponente.vida -=23;
        }else if(diferençaX == 1 && diferençaY == 0){
            oponente.vida -= 20;
        }
        return true;
    }
    public boolean ataqueFinal(Jogador vilão){
        boolean ataque1 = super.atacar(vilão);
        boolean ataque2 = super.atacar(vilão);
        boolean ataque3 = super.atacar(vilão);
        return ataque1 || ataque2 || ataque3;
    }
}

