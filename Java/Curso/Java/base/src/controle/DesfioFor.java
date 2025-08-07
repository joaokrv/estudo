package controle;

public class DesfioFor {
    public static void main(String[] args) {

        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor +="#";
        }

        // DESAFIO
        // Fazer sem usar valor numérico para controlar o laço!

        // Criar variavel String, ao inves de usar valor númerico usar concatenação.
        // Quando o cont chegar a cinco caracteres o for para o lop.

        for (String value = "*" ; !value.equals("******") ; value += "*") {
            System.out.println(value);
        }
    }
}
