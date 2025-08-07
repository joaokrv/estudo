package lambdas.calculos;

@FunctionalInterface
public interface Calculo {

    // Lambda Expression só funciona se tiver apenas um métod ABTRACT na interface
    double executar (double a, double b);

    default String legal() {
        return "Legal";
    }

    static String ok() {
        return "Ok";
    }
}
