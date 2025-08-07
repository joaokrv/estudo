package streams.reduce;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.##");

        Aluno a1 = new Aluno("João", 9.9);
        Aluno a2 = new Aluno("Jose", 8.3);
        Aluno a3 = new Aluno("Jota", 6.9);
        Aluno a4 = new Aluno("Guilherme", 9.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.getNotas() > aluno2.getNotas()) return 1;
            if (aluno1.getNotas() < aluno2.getNotas()) return -1;
            return 0;
        };

        Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
            if (aluno1.getNotas() > aluno2.getNotas()) return -1;
            if (aluno1.getNotas() < aluno2.getNotas()) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());

        System.out.println(alunos.stream().min(piorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());

    }
}
