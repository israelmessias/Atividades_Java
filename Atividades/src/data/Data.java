package data;

import javax.print.DocFlavor;
import java.lang.invoke.VarHandle;

public class Data {
    int dia, ano;
    String  mes;


    Data(int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    String formatarData(){
        final String modeloData;
        return modeloData = String.format("%d/%s/%d",dia, mes, ano);
    }

}
