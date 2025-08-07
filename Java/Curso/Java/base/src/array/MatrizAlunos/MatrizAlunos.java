package array.MatrizAlunos;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class MatrizAlunos {
    public static void main(String[] args) {

        // Scanner
        Scanner in = new Scanner(System.in);

        // Formatação
        DecimalFormat df = new DecimalFormat("0.##");

        // Obtem a instancia do Calendar
        Calendar calendar = Calendar.getInstance();

        // Obtém a hora atual (formato de 24 horas)
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);

        String cumprimento;

        if (hora > 5) {
            System.out.printf("Hora atual: %02d:%02d%n", hora, minuto, "\n");
            cumprimento = "Bom dia";
        } else if (hora > 12) {
            System.out.printf("Hora atual: %02d:%02d%n", hora, minuto, "\n");
            cumprimento = "Boa tarde";
        } else if (hora > 18) {
            System.out.printf("Hora atual: %02d:%02d%n", hora, minuto, "\n");
            cumprimento = "Boa noite";
        } else {
            System.out.printf("Hora atual: %02d:%02d%n", hora, minuto, "\n");
            cumprimento = "Boa madrugada";
        }

        System.out.println(cumprimento + ", a sala possui quantos alunos? ");
        int qntAlunos = in.nextInt();

        System.out.println("Quantas notas irá inserir por aluno? ");
        int qntNotas = in.nextInt();

        double[][] notasTurma = new double[qntAlunos][qntNotas];

        double totNotas = 0;
        for (int i = 0; i < notasTurma.length ; i++) {
            for (int j = 0; j < notasTurma[i].length; j++){
                System.out.println("Insira a " + (j+1) + "ª nota do "+ (i+1) +"º aluno: ");
                notasTurma[i][j] = in.nextDouble();
                totNotas += notasTurma[i][j];
            }
        }

        double media = totNotas / (qntNotas * qntAlunos);

        System.out.println("A média da turma é " + df.format(media));
    }
}
