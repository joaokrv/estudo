package lambdas.funcao;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parImpar =
                n -> n% 2 == 0 ? "Par" : "Impar";

        Function <String, String> resIs =
                valor -> "O resultado foi " + valor;

        Function <String, String> exclamacao =
                valor -> valor + "!!!";

        String resFinal =
                parImpar.andThen(resIs)
                        .andThen(exclamacao)
                        .apply(24);

        System.out.println(resFinal);
        System.out.println(parImpar.apply(24));
    }
}
