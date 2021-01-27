package OO.Composição.Um_Um;

public class Motor {
    //
    boolean ligado = false;
    //O ponto inicial da injeção
    double fatorDeInjeção = 1;

    //Quantidade de giros
    int giros() {
        //
        if(!ligado)
            return 0;
        else
            return (int) Math.round(fatorDeInjeção*3000);
    }

}
