package lambdas.predicado;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PredicadoComposicao {
    public static void main(String[] args) {

        Predicate<Integer> isPar = n -> n % 2 == 0;
        Predicate<Integer> isTresDigitos = n -> n >= 100 && n <= 999;

        UnaryOperator<Integer> sumDois = n -> n + 2;
        UnaryOperator<Integer> multDois = n -> n * 2;
        UnaryOperator<Integer> aoQuad = n -> n * n;

        int resFinal = sumDois.compose(multDois).compose(aoQuad).apply(2);

        System.out.println(resFinal);

        System.out.println(isPar.and(isTresDigitos).test(22));
        System.out.println(isPar.and(isTresDigitos).test(221));

        System.out.println(isPar.or(isTresDigitos).test(22));
        System.out.println(isPar.or(isTresDigitos).test(122));
    }
}
