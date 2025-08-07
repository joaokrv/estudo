package fundamentos;

public class OperadoresTernarios {
    public static void main(String[] args) {

        // Operador Ternario (expressao) ? (true) : (false)

        double nota = 9.2;
        String resParcial = nota >= 5 ? "Reprovado" : "Recuperação";
        String res = nota >= 7 ? "Aprovado" : "Recuperação";
        String resFinal;

        if (nota < 5){
            resFinal = resParcial;
        } else {
            resFinal = res;
        }

        System.out.println("O aluno está " + resFinal);
    }
}
