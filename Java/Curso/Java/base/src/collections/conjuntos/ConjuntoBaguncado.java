package collections.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conj = new HashSet();

        conj.add(1.2); // double -> Double
        conj.add(true); // boolean -> Boolean
        conj.add("Teste"); // ... Converte automaticamente para os Wrappers dos primitivos
        conj.add(1);
        conj.add('x');
        conj.add("teste");

        System.out.println("Tamanho: " + conj.size());

        conj.add("Oi");
        System.out.println("Tamanho: " + conj.size());

        conj.remove("Teste");
        conj.remove("teste");
        System.out.println("Tamanho: " + conj.size());

        System.out.println(conj.remove("TESTE"));
        System.out.println("Tamanho: " + conj.size());

        System.out.println(conj.contains('x'));
        System.out.println(conj.contains("TeSte"));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(1);
        nums.add(3);
        nums.add(2);

        // nums.get(n) não é possível por nao ter indice

        System.out.println(nums);
        System.out.println(conj);

        conj.retainAll(nums); // Imprime apenas o que tem em comum
        System.out.println(conj);

        conj.addAll(nums); // Uniao entre dois conjuntos
        System.out.println(conj);

        conj.clear();
        System.out.println(conj);
    }
}
