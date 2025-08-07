package br.com.estagio.cm.model;

import br.com.estagio.cm.exception.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private boolean marcado = false, aberto = false, minado = false;
    private final int linha, coluna;

    private List<Campo> vizinhos = new ArrayList<>();

    public Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public boolean isFechado() {
        return !isAberto();
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isMinado() {
        return minado;
    }

    public void setMinado(boolean minado) {
        this.minado = minado;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public List<Campo> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(List<Campo> vizinhos) {
        this.vizinhos = vizinhos;
    }

    public boolean addVizinho(Campo vizinho) {
        boolean linhaDiff = getLinha() != vizinho.getLinha();
        boolean colunaDiff = getColuna() != vizinho.getColuna();
        boolean diagonal = linhaDiff && colunaDiff;

        int deltaLinha = Math.abs(getLinha() - vizinho.getLinha());
        int deltaColuna = Math.abs(getColuna() - vizinho.getColuna());

        int deltaTot = deltaColuna + deltaLinha;

        if (deltaTot == 1 && !diagonal) {
            getVizinhos().add(vizinho);
            return true;
        } else if (deltaTot == 2 && diagonal) {
            getVizinhos().add(vizinho);
            return true;
        } else {
            return false;
        }
    }

    public void alternarMark() {
        if(!isAberto()) {
            setMarcado(!isMarcado()); // Alternar true e false
        }
    }

    public boolean abrirCampo(){
        if (!isAberto() && !isMarcado()) {
            setAberto(true);

            if (isMinado()){
                throw new ExplosaoException();
            }

            if (vizinhancaSegura()) {
                vizinhos.forEach(v -> v.abrirCampo());
            }

            return true;
        } else {
            return false;
        }

    }

    public boolean vizinhancaSegura() {
        return vizinhos.stream()
                .noneMatch(v -> v.isMinado());
    }

    public void minarCampo() {
        setMinado(true);
    }

    public boolean objetivoAlcancado() {
        boolean desvendado = !isMinado() && isAberto();
        boolean protegido = isMarcado() && isMinado();
        return desvendado || protegido;
    }

    public long minasNaVizinhanca() {
        return vizinhos.stream()
                .filter(v -> v.isMinado())
                .count();
    }

    public void resetar() {
        setAberto(false);
        setMinado(false);
        setMarcado(false);
    }

    @Override
    public String toString() {
        if (marcado) {
            return "X";
        } else if (aberto && minado) {
            return "*";
        } else if (aberto && minasNaVizinhanca() > 0) {
            return Long.toString(minasNaVizinhanca());
        } else if (aberto) {
            return " ";
        } else {
            return "?";
        }
    }
}
