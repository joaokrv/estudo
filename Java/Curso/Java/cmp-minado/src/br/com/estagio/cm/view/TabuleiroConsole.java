package br.com.estagio.cm.view;

import br.com.estagio.cm.exception.ExplosaoException;
import br.com.estagio.cm.exception.SairException;
import br.com.estagio.cm.model.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    private Scanner in = new Scanner(System.in);

    public TabuleiroConsole (Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;

        execJogo();
    }

    private void execJogo() {
        try {
            boolean continuar = true;

            while (continuar) {
                loopDoJogo();

                System.out.println("Você deseja fazer outra partida? (S/n) ");
                String resposta = in.nextLine();

                if ("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }

        } catch (SairException e) {
            System.out.println("Tchau!");
        } finally {
            in.close();
        }
    }

    private void loopDoJogo() {
        try {

            while (!tabuleiro.objetivoAlcancado()) {

                System.out.println(tabuleiro.toString());

                String digitado = capturarValorDigitado("Digite (x, y): ");

                Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                        .map(e -> Integer.parseInt(e.trim()))
                        .iterator();

                digitado = capturarValorDigitado("1 - Abrir\n2 - (Des)Marcar");

                if ("1".equalsIgnoreCase(digitado)) {
                    tabuleiro.abrirCampo(xy.next(), xy.next());
                } else if ("2".equalsIgnoreCase(digitado)) {
                    tabuleiro.alterarMark(xy.next(), xy.next());
                }
            }

            System.out.println(tabuleiro.toString());
            System.out.println("Você ganhou!");

        } catch (ExplosaoException e) {
            System.out.println(tabuleiro.toString());
            System.out.println("Você perdeu!");
        }
    }


    private String capturarValorDigitado(String texto) {
        System.out.println(texto);
        String digitado = in.nextLine();

        if ("sair".equalsIgnoreCase(digitado)) {
            throw new SairException();
        }
        return digitado;
    }

}
