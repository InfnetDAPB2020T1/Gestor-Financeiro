package tech.futuresolucoes.gestorfinanceiro.exceptions;

public class InvalidOperacaoException extends RuntimeException {

    public InvalidOperacaoException(String msg){
        super(msg);
    }
}
