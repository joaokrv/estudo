package array.DesafioArray;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DesafioArrays {
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

        int tamanho = 0;

        System.out.println(cumprimento + ", quantas notas irá inserir? ");
        tamanho = in.nextInt();

        double[] notas = new double[tamanho];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira a " + (i+1) + " nota: ");
            notas[i] = in.nextDouble();
        }

        double soma = 0;

        for (double nota: notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("A média de notas do aluno é " + df.format(media));
    }
}
