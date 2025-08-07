package exceptions.basico;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            printAluno(a1);
        } catch (Exception e){
            System.out.println("Ocorreu um erro ao mostrar o nome");
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        System.out.println("\nFim!");

    }

    public static void printAluno(Aluno aluno){
        System.out.println(aluno.getNome());
    }
}
