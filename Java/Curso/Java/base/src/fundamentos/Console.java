package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Bom");
        System.out.println("dia");

        System.out.printf("Megasena: %d %d %d %d %d", 1, 2, 3, 4, 5);
        System.out.printf("\nSalário: %.1f\n", 123456.5678);
        System.out.printf("Nome: %s\n", "João");

        System.out.println("Digite seu nome:");
        String nome = in.nextLine();

        System.out.printf("Olá, %s", nome);

        System.out.println("\nQuantos anos tem?");
        int idade = in.nextInt();

        if (idade <= 0){
            System.out.println("\nA idade deve ser maior que 0, dê rerun e tente novamente");
        } else if(idade < 18) {
            System.out.printf("\nUau %s! Você ainda tem %d anos, ou seja, é de menor", nome, idade);
        } else {
            System.out.printf("\nUau %s! Você tem %d anos, ou seja, é de maior", nome, idade);
        }
    }
}
