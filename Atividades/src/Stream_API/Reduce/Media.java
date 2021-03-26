package Stream_API.Reduce;

public class Media {
    private double total;
    private int quantidade;

    public Media adicionar(double valor){
        total += valor;
        quantidade++;
        return this;
    }

    public double getValor(){
        return total/quantidade;
    }

    public static Media combinar(Media n1, Media n2){
        Media resultado = new Media();
        resultado.total = n1.total + n2.total;
        resultado.quantidade = n1.quantidade + n2.quantidade;
        return resultado;
    }

}
