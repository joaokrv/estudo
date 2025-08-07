package lambdas.calculos;

import java.util.function.BinaryOperator;

public class CalculoMain2 {
    public static void main(String[] args) {

        // Interface própria do Java, já pronta!
        BinaryOperator<Double> calculo = (x, y) -> x + y; // Lambda Function
        System.out.println(calculo.apply(2.0, 5.0));

        calculo = (x, y) ->  x*y; // Lambda Function
        System.out.println(calculo.apply(2.0, 5.0));
    }
}
