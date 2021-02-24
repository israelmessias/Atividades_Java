package OO.Encapsulamento.CasaA;

public class Paulo {
    Ana esposa = new Ana();

    void testAcesso(){
        //System.out.println(esposa.segredo);  Erro pois metodo segredo é privado
        System.out.println(esposa.maniaFamilia);
        System.out.println(esposa.facoDentroCasa);
        System.out.println(esposa.todosSabem);
    }
}
