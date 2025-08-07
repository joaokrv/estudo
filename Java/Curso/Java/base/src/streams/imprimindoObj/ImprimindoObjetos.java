package streams.imprimindoObj;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Gui", "Joao", "Andre", "Junior");

        System.out.println("Usando foreach: ");
        for (String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iteraor: ");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) { // Tem proximo = hasNext
            System.out.println(iterator.next()); // Passa pro proximo
        }

        System.out.println("\nUsando Stream: ");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // laço interno -> programação funcional

    }
}
