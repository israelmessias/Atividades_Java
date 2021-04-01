package Generics.ComGenerics;

/*
Foi restringindo o tipo de generics para o tipo Number que é um tipo
de Classe pai dos tipo int, double, long, float
*/
public class CaixaNumero<N extends Number> extends Caixa<N>{
}
