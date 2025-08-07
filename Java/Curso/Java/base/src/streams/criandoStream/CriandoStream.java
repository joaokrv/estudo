package streams.criandoStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("JS", "Java", "C#\n"); // métod estático pra criar stream
        langs.forEach(print);

        String [] maisLangs = {"Go", "PHP", "Pearl\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        List<String> otherLangs = Arrays.asList("C", "Kotlin", "Flutter\n");
        otherLangs.stream().forEach(print);
        otherLangs.parallelStream().forEach(print);

        // Stream.generate(() -> "Teste").forEach(print);
        Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
