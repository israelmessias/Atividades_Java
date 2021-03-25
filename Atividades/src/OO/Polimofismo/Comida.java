package OO.Polimofismo;

public abstract class Comida {
    private double peso;

    public Comida(double comida){
        setPeso(peso);
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
}
