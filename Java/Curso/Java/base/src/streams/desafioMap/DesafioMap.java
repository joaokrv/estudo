package streams.desafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static streams.desafioMap.Funcoes.*;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer<Integer> print = System.out::println;
        Consumer<String> printS = System.out::println;

        /*
         * 1. Número para string binária... 6 -> "110"
         * 2. Inverter string... "110" -> "011"
         * 3. Converter de volta para inteiro... "011" -> 3
         */

        nums.stream()
                .map(intToString)
                .forEach(printS);

        nums.stream() // build
                .map(intToString) // intermediaria
                .map(invertString)
                .forEach(printS); // terminar

        System.out.println("\n");

        nums.stream()
                .map(intToString)
                .map(invertString)
                .map(stringToInt)
                .forEach(print);

    }
}
