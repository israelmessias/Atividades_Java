package OO.Herança.Enum.Carro;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari(){super(315);}
    @Override
    public void ligarTurbo() {ligarTurbo = true;}
    @Override
    public void desligarTurbo() {ligarTurbo = false;}
    @Override
    public void ligarAr() {ligarAr = true;}
    @Override
    public void desligarAr() {ligarAr = false;}

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return delta = 35;
        }
        else if(ligarTurbo && ligarAr){
            return delta = 30;
        }
        else if(!ligarTurbo && !ligarAr){
            return delta = 20;
        }
        else if(!ligarTurbo && ligarAr){
            return delta = 15;
        }
        return delta;
    }
}
