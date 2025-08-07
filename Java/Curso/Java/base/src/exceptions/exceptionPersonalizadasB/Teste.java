package exceptions.exceptionPersonalizadasB;

public class Teste {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Joao", -7);

        try {
            Validar.aluno(a1);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM!");
    }
}
