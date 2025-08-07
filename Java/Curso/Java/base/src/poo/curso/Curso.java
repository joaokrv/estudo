package poo.curso;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    final List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
