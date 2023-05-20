package dio.exceptions;

/*Classe que representa uma Exception*/
public class DivisaoNaoExataException extends Exception{//para ela ser uma exception, precisamos colocar 'extends Exception'
    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) { //opcao selecionada por ser simples
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

}
