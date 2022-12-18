package loja;

public class DomainException extends RuntimeException {

    private static final long serialverionUID = 1L;

    public DomainException(String mensagem) {
        super(mensagem);
    }
}
