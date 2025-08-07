package fundamentos;

import java.util.Scanner;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        // Se um trabalho der certo (V), comprar TV 32' C
        // Se dois trabalho der certo (V), comprar TV 50' C
        // Indo comprar TV, também vão tomar sorvete C
        // Se nenhum dos trabalhos derem certo, não vão comprar nem ir tomar sorvete C

        Scanner in = new Scanner(System.in);

        boolean trabalho1 = false, trabalho2 = false, compras, sorvete;

        System.out.println("Olá, senhor! Seu primeiro trabalho deu certo? (sim/não)");
        String res = in.next();

        if (res.equalsIgnoreCase("sim")) {
            trabalho1 = true;
        } else if (res.equalsIgnoreCase("não") || res.equalsIgnoreCase("nao")) {
            trabalho1 = false;
        }

        System.out.println("Olá, senhor! Seu segundo trabalho deu certo? (sim/não)");
        res = in.next();

        if (res.equalsIgnoreCase("sim")) {
            trabalho2 = true;
        } else if (res.equalsIgnoreCase("não") || res.equalsIgnoreCase("nao")) {
            trabalho2 = false;
        }

        if (trabalho1 && trabalho2) {
            compras = true;
            sorvete = true;

            System.out.println("O senhor irá comprar uma TV de 50 polegadas, e tomará sorvete com a família");
        } else if (!trabalho1 && !trabalho2) {
            System.out.println("O senhor não irá conseguir comprar nem a TV, nem o sorvete");
        }

        if (trabalho1 ^ trabalho2) {
            compras = true;
            sorvete = true;

            System.out.println("O senhor irá comprar uma TV de 32 polegadas, e tomará sorvete com a família");
        } else if (!trabalho1 && !trabalho2) {
            System.out.println("O senhor não irá conseguir comprar nem a TV, nem o sorvete");
        }
    }
}
