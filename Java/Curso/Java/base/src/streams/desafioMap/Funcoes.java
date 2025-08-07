package streams.desafioMap;

import java.util.function.Function;

public interface Funcoes {

    public Function<Integer, String> intToString =
            n -> Integer.toBinaryString(n);

    public Function<String, String> invertString =
            s -> new StringBuilder(s).reverse().toString();

    public Function<String, Integer> stringToInt =
            (s -> Integer.parseInt(s, 2));
}
