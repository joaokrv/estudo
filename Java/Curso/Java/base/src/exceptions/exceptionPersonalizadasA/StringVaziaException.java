package exceptions.exceptionPersonalizadasA;

public class StringVaziaException extends Throwable {

    private String nomeAtributo;

    public StringVaziaException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio", nomeAtributo);
    }
}
