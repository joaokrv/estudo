package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto"); // Adicionar
        usuarios.put(1, "Ronaldo"); // Atualizar/Alterar

        System.out.println(usuarios.size());

        usuarios.put(2, "Joao");
        usuarios.put(3, "Joao");
        usuarios.put(4, "Joao");

        System.out.println(usuarios.size());

        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Joao"));
        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(2, "Guilherme"));

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }


    }
}
