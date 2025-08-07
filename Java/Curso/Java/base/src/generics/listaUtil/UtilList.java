package generics.listaUtil;

import java.util.List;

public class UtilList {

    public static Object getUltimo(List<?> lista) {
        return lista.getLast(); // pega o ultimo elemento
    }

    public static <T> T getUltimo2(List<T> lista) {
        return lista.getLast(); // pega o ultimo elemento
    }

    public static <A, B, C> C teste(A paramA, B paramB) {
        C teste = null;
        return teste;
    }
}
