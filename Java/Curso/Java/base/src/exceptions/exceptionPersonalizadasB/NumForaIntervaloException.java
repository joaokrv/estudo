package exceptions.exceptionPersonalizadasB;

public class NumForaIntervaloException extends Exception{

    private String nomeAtributo;

    public NumForaIntervaloException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está inválida", nomeAtributo);
    }
}
