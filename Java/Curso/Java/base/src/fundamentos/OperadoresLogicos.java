package fundamentos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // TABELA VERDADE AND - &&
        // A B C RES
        // V V V  V
        // V V F  F
        // V F V  F
        // F F F  F
        System.out.println("\nTABELA VERDADE AND");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // TABELA VERDADE OR - ||
        // A B C RES
        // V V V  V
        // V V F  V
        // V F V  V
        // V F F  V
        // F F F  F
        System.out.println("\nTABELA VERDADE OR");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // TABELA VERDADE XOR - ^
        // A B C RES
        // V V V  F
        // V V F  V
        // V F V  V
        // V F F  V
        // F F F  F
        System.out.println("\nTABELA VERDADE XOR");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // TABELA VERDADE NOT - ! ( Contrário/Negação )
        // A B C RES
        // V V V  F
        // V V F  F
        // V F V  F
        // V F F  F
        // F F F  V
        System.out.println("\nTABELA VERDADE NOT");
        System.out.println(!true);
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!false);

        boolean condition1 = true;
        boolean condition2 = 3 > 7;

        System.out.println("\nExemplos");
        System.out.println(condition1 && condition2);
        System.out.println(condition1 || condition2);
        System.out.println(condition1 ^ condition2);
        System.out.println(condition1);
        System.out.println(condition2);

    }
}
