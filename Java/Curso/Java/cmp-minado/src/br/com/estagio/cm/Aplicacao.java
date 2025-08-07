package br.com.estagio.cm;

import br.com.estagio.cm.model.Tabuleiro;
import br.com.estagio.cm.view.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}
