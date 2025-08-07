package exceptions.exceptionPersonalizadasA;

public class Validar {

    private Validar() {

    }

    public static void aluno (Aluno aluno) throws StringVaziaException {
        if (aluno == null){
            throw new IllegalArgumentException("O aluno está nulo!");
        }

        if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.getNotas() < 0 || aluno.getNotas() > 10) {
            throw new NumForaIntervaloException("nota");
        }
    }
}
