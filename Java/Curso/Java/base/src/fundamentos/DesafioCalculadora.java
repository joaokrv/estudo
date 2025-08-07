package fundamentos;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // Ler num1 e num2
        // Pedir a operação que o usuário irá fazer
        // + - * / %

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

        System.out.println(cumprimento + ", digite o primeiro número: ");
        double num1 = in.nextDouble();

        System.out.println(cumprimento + ", digite o segundo número: ");
        double num2 = in.nextDouble();

        System.out.println("Agora, insira qual operação deseja fazer: ");
        System.out.println("+ Adição\n- Subtração\n* Multiplicação\n: Divisão\n% Resto");
        String operacao = in.next();

        double res;

        // If - else
        // if (operacao.equals("+")) {
        //     res = num1 + num2;
        //     System.out.println("\nCALCULADORA\nOPERAÇÃO = ADIÇÃO\n" + num1 + " + " + num2 + " = " + df.format(res));
        // } else if (operacao.equals("-")) {
        //     res = num1 - num2;
        //     System.out.println("\nCALCULADORA\nOPERAÇÃO = SUBTRAÇÃO\n" + num1 + " - " + num2 + " = " + df.format(res));
        // } else if (operacao.equals("*")) {
        //     res = num1 * num2;
        //     System.out.println("\nCALCULADORA\nOPERAÇÃO = MULTIPLICAÇÃO\n" + num1 + " X " + num2 + " = " + df.format(res));
        // } else if (operacao.equals(":")) {
        //     res = num1 / num2;
        //     System.out.println("\nCALCULADORA\nOPERAÇÃO = DIVISÃO\n" + num1 + " : " + num2 + " = " + df.format(res));
        // } else if (operacao.equals("%")){
        //     res = num1 % num2;
        //     System.out.println("\nCALCULADORA\nOPERAÇÃO = RESTO\n" + num1 + " % " + num2 + " = " + df.format(res));
        // }

        // Operadores Ternarios
        res = "+".equals(operacao) ? num1 + num2 : 0;
        res = "-".equals(operacao) ? num1 - num2 : res;
        res = "*".equals(operacao) ? num1 * num2 : res;
        res = ":".equals(operacao) ? num1 / num2 : res;
        res = "%".equals(operacao) ? num1 % num2 : res;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, res);
    }
}
