package modelo.heranca;

import javax.persistence.*;

@Entity
@DiscriminatorValue("aluno")
public class Aluno extends Pessoa {

    @Column
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{id=" + getId() + ", nome='" + getNome() + "', curso='" + curso + "'}";
    }

}
