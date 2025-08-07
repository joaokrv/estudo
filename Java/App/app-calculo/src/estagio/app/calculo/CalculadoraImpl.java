package estagio.app.calculo;

import estagio.app.Calculadora;
import estagio.app.calculo.interno.OperacoesAritmeticas;
import estagio.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {

    private OperacoesAritmeticas opAritimeticas = new OperacoesAritmeticas();

    private String id = "abv";

    public double soma(double... nums) {
        Logger.info("Somando...");
        return opAritimeticas.soma(nums);
    }

    public String getId() {
        return id;
    }
}
