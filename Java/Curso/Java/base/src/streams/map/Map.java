package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static streams.map.Utilitarios.*;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        // UnaryOperator<String> minuscula =
        //         n -> n.toLowerCase();

        // UnaryOperator<String> maiscula =
        //         n -> n.toUpperCase();

        // UnaryOperator<String> firstLetter =
        //         n -> n.charAt(0) + "";

        List<String> marcas = Arrays.asList("Audi", "BMW", "Fiat");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("\nUsando composição: ");
        marcas.stream()
                .map(maiscula)
                .map(firstLetter)
                .forEach(print);

        System.out.println("\n");
        marcas.stream()
                .map(minuscula)
                .map(firstLetter)
                .forEach(print);
    }
}
