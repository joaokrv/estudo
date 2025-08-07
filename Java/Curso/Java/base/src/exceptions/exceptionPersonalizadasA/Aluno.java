package exceptions.exceptionPersonalizadasA;

import java.util.Objects;

public class Aluno {

    private String nome;
    private double notas;
    private boolean bomComportamento;


    public Aluno(String nome, double notas) {
        this(nome, notas, true);
    }

    public Aluno(String nome, double notas, boolean bomComportamento) {
        this.nome = nome;
        this.notas = notas;
        this.bomComportamento = bomComportamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public boolean isBomComportamento() {
        return bomComportamento;
    }

    public void setBomComportamento(boolean bomComportamento) {
        this.bomComportamento = bomComportamento;
    }

    @Override
    public String toString() {
        return getNome() + " tem nota " + getNotas();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(notas, aluno.notas) == 0 && bomComportamento == aluno.bomComportamento && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, notas, bomComportamento);
    }
}

