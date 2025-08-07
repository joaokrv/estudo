package streams.map;

import java.util.function.UnaryOperator;

public interface Utilitarios {

      static UnaryOperator<String> minuscula =
            n -> n.toLowerCase();

      static UnaryOperator<String> maiscula =
            n -> n.toUpperCase();

      static UnaryOperator<String> firstLetter =
            n -> n.charAt(0) + "";
}
