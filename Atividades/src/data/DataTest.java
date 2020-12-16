package data;


public class DataTest {
    public static void main (String[] args){
        var data = new Data(15, "Outubro", 2020);
        data.dia = 17;
        data.mes = "Setembro";
        System.out.println(data.formatarData());


    }

}
