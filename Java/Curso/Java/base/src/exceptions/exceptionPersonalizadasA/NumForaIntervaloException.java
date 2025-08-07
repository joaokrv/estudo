package exceptions.exceptionPersonalizadasA;

public class NumForaIntervaloException extends RuntimeException{

    private String nomeAtributo;

    public NumForaIntervaloException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está inválida", nomeAtributo);
    }
}
