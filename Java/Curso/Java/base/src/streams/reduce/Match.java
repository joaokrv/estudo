package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", 9.9);
        Aluno a2 = new Aluno("Jose", 8.3);
        Aluno a3 = new Aluno("Jota", 6.9);
        Aluno a4 = new Aluno("Guilherme", 9.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovados = aluno -> aluno.getNotas() >= 7;
        Predicate<Aluno> reprovados = aprovados.negate();

        System.out.println(alunos.stream().allMatch(aprovados)); // Se todos forem aprovados
        System.out.println(alunos.stream().anyMatch(aprovados)); // Se algum foi aprovado
        System.out.println(alunos.stream().noneMatch(reprovados)); // Se nenhum foi aprovado

    }
}
