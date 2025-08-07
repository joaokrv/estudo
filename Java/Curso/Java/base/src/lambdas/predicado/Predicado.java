package lambdas.predicado;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<Produto> isCaro =
                prod -> (prod.getPreco() * (1 - prod.desconto)) >= 700;

        Produto p = new Produto("Celular", 999.99, 0.15);

        System.out.println(isCaro.test(p));
    }
}
