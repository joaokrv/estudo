package fundamentos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        // Pegar todos os valores em string, converter pra
        // numérico. o funcionario pode usar , ou .
        // ao final fazer média dos salários

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("Qual foi seu primeiro salário?");
        String salario1 = in.nextLine().replace(",",".");

        System.out.println("Qual foi seu segundo salário?");
        String salario2 = in.nextLine().replace(",",".");

        System.out.println("Qual foi seu terceiro salário?");
        String salario3 = in.nextLine().replace(",",".");

        double sal1 = Double.parseDouble(salario1);
        double sal2 = Double.parseDouble(salario2);
        double sal3 = Double.parseDouble(salario3);

        double media = (sal1 + sal2 + sal3)/3;
        String mFormat = "R$ " + df.format(media);

        System.out.println("Média dos seus salários: " + mFormat);
    }
}
