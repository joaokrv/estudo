package collections.conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrganizado {
    public static void main(String[] args) {

        // Set<String> lista = new HashSet<String>();
        // Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>(); // Lista Ordenada com dados homogeneos do tipo String
        lista.add("João");
        lista.add("10");
        lista.add("Jandrei");
        lista.add("Jose");
        lista.add("Pedro");

        for (String nome: lista) {
            System.out.println(nome);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for (int n: nums){
            System.out.println(n);
        }
    }
}
