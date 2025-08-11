package br.com.estagio.cm.model;

import br.com.estagio.cm.exception.ExplosaoException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro {

    private int linhas, colunas, minas;
    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
        
        gerarCampos();
        associarVizinhos();
        sortearMinas();
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public int getMinas() {
        return minas;
    }

    public void setMinas(int minas) {
        this.minas = minas;
    }

    public List<Campo> getCampos() {
        return campos;
    }

    private void gerarCampos() {
        for (int i = 0; i < getLinhas(); i++) {
            for (int j = 0; j < getColunas(); j++) {
                campos.add(new Campo(i, j));
            }
        }
    }

    private void associarVizinhos() {
        for (Campo c1: campos) {
            for (Campo c2: campos) {
                c1.addVizinho(c2);
            }
        }
    }

    private void sortearMinas() {
        long minasArmdas = 0;
        Predicate<Campo> minado = c -> c.isMinado();

        do {
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minarCampo();
            minasArmdas = campos.stream()
                    .filter(minado)
                    .count();

        } while (minasArmdas < getMinas());
    }

    public boolean objetivoAlcancado(){
        return campos.stream().allMatch(c -> c.objetivoAlcancado());
    }

    public void reiniciar() {
        campos.stream().forEach(c -> c.resetar());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("  ");

        for (int c = 0; c < getColunas(); c++) {
            sb.append(" ");
            sb.append(c);
            sb.append(" ");
        }

        sb.append("\n");

        int i = 0;
        for (int l = 0; l < getLinhas(); l++) {

            sb.append(" ");
            sb.append(l);

            for (int c = 0; c < getColunas(); c++) {
                sb.append(" ");
                sb.append(campos.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public void abrirCampo(int linha, int coluna) {
        try {
            campos.parallelStream()
                    .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                    .findFirst() // Pega o primeiro da lista
                    .ifPresent(c -> c.abrirCampo()); // Se estiver presente abre o campo
        } catch (ExplosaoException e) {
            campos.forEach(c -> c.setAberto(true));
            throw e;
        }
    }

    public void alterarMark(int linha, int coluna) {
        campos.stream()
                .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                .findFirst() // Pega o primeiro da lista
                .ifPresent(c -> c.alternarMark()); // Se estiver presente abre o campo
    }
}
