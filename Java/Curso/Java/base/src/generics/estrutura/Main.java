package generics.estrutura;

public class Main {
    public static void main(String[] args) {

        Pares<Integer, String> resConcurso = new Pares<>();

        resConcurso.add(1, "João");
        resConcurso.add(2, "Pedro");
        resConcurso.add(3, "Jose");
        resConcurso.add(4, "Guilherme");
        resConcurso.add(2, "Leonardo");

        System.out.println(resConcurso.getValor(2));
        System.out.println(resConcurso.getValor(4));
        System.out.println(resConcurso.getValor(1));

    }
}
