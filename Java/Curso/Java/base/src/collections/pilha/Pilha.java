package collections.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        // Adiciona
        livros.add("O pequeno"); // Retorna true or false
        livros.push("Pinoquio"); // Retorna uma exceção
        livros.push("O Hobbit");

        for (String livro: livros){
            System.out.println(livro);
        }

        // Mesmo conceito da lista, um retorna true e o outro exceção
        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.pop());

        // livros.size()
        // livros.clear()
        // livros.contains()
        // ...

        System.out.println(livros.peekLast());
    }
}
