package controle;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // Domingo -> 1
        // Segunda -> 2
        // Terça -> 3
        // Quarta -> 4
        // Quinta -> 5
        // Sexta -> 6
        // Sábado -> 7
        // ler entrada do usuário e devolver o número

        // Scanner
        Scanner in = new Scanner(System.in);

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

        System.out.println(cumprimento + ", que dia da semana é hoje?");
        String dia = in.next();
        int numDia;

        if (dia.equalsIgnoreCase("domingo")){
            numDia = 1;
            System.out.println("Hoje é o " + numDia + "º dia da semana!");
        } else if ((dia.equalsIgnoreCase("segunda")) || dia.equalsIgnoreCase("segunda-feira")){
            numDia = 2;
            System.out.println("Hoje é o " + numDia + "º dia da semana!");
        } else if ((dia.equalsIgnoreCase("terça")) || dia.equalsIgnoreCase("terça-feira")){
            numDia = 3;
            System.out.println("Hoje é o " + numDia + "º dia da semana!");
        } else if ((dia.equalsIgnoreCase("quarta")) || dia.equalsIgnoreCase("quarta-feira")){
            numDia = 4;
            System.out.println("Hoje é o " + numDia + "º dia da semana!");
        } else if ((dia.equalsIgnoreCase("quinta")) || dia.equalsIgnoreCase("quinta-feira")){
            numDia = 5;
            System.out.println("Hoje é o " + numDia + "º dia da semana!");
        } else if ((dia.equalsIgnoreCase("sexta")) || dia.equalsIgnoreCase("sexta-feira")){
            numDia = 6;
            System.out.println("Hoje é o " + numDia + "º dia da semana!");
        } else {
            numDia = 7;
            System.out.println("Hoje é o " + numDia + "º dia da semana!");
        }
    }
}
