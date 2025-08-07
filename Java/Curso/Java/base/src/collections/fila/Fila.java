package collections.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Difernça ocorre com a fila cheia
        fila.add("Joao"); // Adiciona mas trata com erro/exceção
        fila.add("Lucas");
        fila.offer("Joel");
        fila.offer("Pedro"); // Retorna falso se nao conseguir

        // Difernça ocorre com a fila vazia
        // Peek e Element -> obter próximo elementos da fila sem remover
        System.out.println(fila.peek()); // Retorna nulo se nao tiver nada na lista
        System.out.println(fila.element()); // Retorna erro/exceção se nao tiver nada na lista

        // fila.size()
        // fila.clear()
        // fila.isEmpty()
        // fila.contains()
        // fila.addAll()
        // ...

        // Difernça ocorre com a fila vazia
        // Pool e Remove obtém o próximo elemtno da fila e remove
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); // lança erro/exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

    }
}
