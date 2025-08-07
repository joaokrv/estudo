package poo.curso;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    final List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return nome;
    }

    public Curso getCursoNome(String nome) {
        for (Curso curso: this.cursos) {
            if (curso.getNome().equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
