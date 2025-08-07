package streams.reduce;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.##");

        Aluno a1 = new Aluno("João", 9.9);
        Aluno a2 = new Aluno("Jose", 8.3);
        Aluno a3 = new Aluno("Jota", 6.9);
        Aluno a4 = new Aluno("Guilherme", 9.2);
        Aluno a5 = new Aluno("Josue", 5.9);
        Aluno a6 = new Aluno("Gustavo", 9.7);
        Aluno a7 = new Aluno("Guilherme", 9.2);
        Aluno a8 = new Aluno("Josue", 5.9);
        Aluno a9 = new Aluno("Gustavo", 9.7);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9);

        alunos.forEach(System.out::println);

        System.out.println("\nDistinct..."); // Retira elements duplicados
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .skip(1)
                .takeWhile(aluno -> aluno.getNotas() >= 7)
                .forEach(System.out::println);

    }
}
