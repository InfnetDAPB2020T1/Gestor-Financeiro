package tech.futuresolucoes.gestorfinanceiro.exceptions;

public class InvalidCategoriaException extends RuntimeException {

    public InvalidCategoriaException(String msg){
        super(msg);
    }
}
