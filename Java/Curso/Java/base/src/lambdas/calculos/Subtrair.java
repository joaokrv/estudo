package lambdas.calculos;

public class Subtrair implements Calculo {

    @Override
    public double executar(double a, double b) {
        return a-b;
    }
}
