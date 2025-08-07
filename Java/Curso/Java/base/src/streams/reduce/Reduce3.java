package streams.reduce;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.##");

        Aluno a1 = new Aluno("João", 9.9);
        Aluno a2 = new Aluno("Jose", 8.3);
        Aluno a3 = new Aluno("Jota", 6.9);
        Aluno a4 = new Aluno("Guilherme", 9.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovados = aluno -> aluno.getNotas() >= 7;
        Function<Aluno, Double> apenasNota = aluno -> aluno.getNotas();
        BinaryOperator<Double> soma = (a, b) -> a + b;

        BiFunction<Media, Double, Media> calcMedia =
                (media, nota) -> media.add(nota);

        BinaryOperator<Media> combinarMedia =
            (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream()
                .filter(aprovados)
                .map(apenasNota)
                .reduce(new Media(), calcMedia, combinarMedia);

        System.out.println("A média dos aprovados: " + df.format(media.getMedia()));
    }
}
