package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", 9.8);
        Aluno a2 = new Aluno("Andre", 7.0);
        Aluno a3 = new Aluno("Guilherme", 7.8);
        Aluno a4 = new Aluno("Jose", 5.8);
        Aluno a5 = new Aluno("Chaves", 6.8);
        Aluno a6 = new Aluno("Pedro", 9.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.getNotas() >= 7;
        Function<Aluno, String> stringAprovado =
                a -> "Parabéns " + a.getNome() + "! Você foi aprovado!";

        alunos.stream()
                .filter(aprovado)
                .map(stringAprovado)
                .forEach(System.out::println);
    }
}
