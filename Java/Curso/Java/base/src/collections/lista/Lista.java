package collections.lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Joao"));
        lista.add(new Usuario("Jose"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Josue"));
        lista.add(new Usuario("Jurandir"));

        System.out.println(lista.get(3)); // Acesso pelo índice

        lista.remove(1);
        System.out.println(lista.remove(1));
        System.out.println(lista.remove(new Usuario("Pedro")));

        System.out.println(lista.contains("Tem? " + (new Usuario("Jurandir"))));

        for (Usuario u: lista){
            System.out.println(u.getNome());
        }
    }
}
