package controle;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DesafioIfElse {
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
            cumprimento = "\nBom dia";
        } else if (hora > 12) {
            System.out.printf("Hora atual: %02d:%02d%n", hora, minuto, "\n");
            cumprimento = "\nBoa tarde";
        } else if (hora > 18) {
            System.out.printf("Hora atual: %02d:%02d%n", hora, minuto, "\n");
            cumprimento = "\nBoa noite";
        } else {
            System.out.printf("Hora atual: %02d:%02d%n", hora, minuto, "\n");
            cumprimento = "\nBoa madrugada";
        }

        double nota;
        String nome;

        System.out.println( cumprimento + ", qual o nome do aluno?");
        nome = in.nextLine();

        System.out.println("Qual a nota do " + nome + "?");
        nota = in.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota Inválida");
        } else if (nota > 9.5) {
            System.out.println("Excelente nota! Nota: " + df.format(nota));
        } else if (nota > 7){
            System.out.println("Aluno passou! Nota: " + df.format(nota));
        } else if (nota <= 6) {
            System.out.println("Aluno de recuperação, nota: " + df.format(nota));
        }


    }
}
