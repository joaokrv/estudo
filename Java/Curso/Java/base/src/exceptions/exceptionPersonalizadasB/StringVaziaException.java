package exceptions.exceptionPersonalizadasB;

public class StringVaziaException extends Exception {

    private String nomeAtributo;

    public StringVaziaException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio", nomeAtributo);
    }
}
