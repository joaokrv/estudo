package fundamentos;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        // == -> comparação

        System.out.println(a == b);
        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 4);
        System.out.println(3 <= 4);
        System.out.println(3 != 4);

        double nota = 9.2;
        boolean bomComprtamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComprtamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);

    }
}
