package lambdas.foreach;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("João", "Pedro", "Luiz", "José");

        System.out.println("Forma tradicional: ");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01: ");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference #01: ");// Referenciou ao metodo
        aprovados.forEach(System.out::println); // :: = passa o parametro direto para o println (menos flexivel)

        System.out.println("\nLambda #02: ");
        aprovados.forEach(nome -> meuPrint(nome));

        System.out.println("\nMethod Reference #02: ");
        aprovados.forEach(Foreach::meuPrint); // referenciou ao metodo que foi criado localmente no codigo
    }

    static void meuPrint(String nome){
        System.out.println("Oi, meu nome é " + nome);
    }
}
