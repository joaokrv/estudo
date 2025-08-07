package controle;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        // Média de notas de alunos usando while, mas não sei quantos alunos tem na sala
        // Usuário digitará nota válida, que será adicionada a uma variável com valor total
        // outra variavel ira ter um contador de notas. Ao digitar -1 o programa ira sair

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

        System.out.println("-------------\nMÉDIA DE NOTAS");
        System.out.println("Para finalizar digite: -1\n-------------\n");

        int cont = 0;
        double notaTot = 0, nota = 0;

        while (nota != -1) {
            // Contador de notas válidas

            System.out.print(cumprimento + ", insira a nota (use vírgula para números decimais - 1,2 | 9,5 | 3,5): ");
            nota = in.nextDouble();

            if (nota >= 0 && nota <= 10){
                System.out.println("Nota cadastrada com suceso!\n");
                notaTot += nota;
                cont++;
            } else {
                System.out.println("Nota inválida!");
            }
        }

        double media = notaTot / cont;

        System.out.println("\n-------------\nMédia das notas da turma de " + cont + " alunos = " + df.format(media));

    }
}
