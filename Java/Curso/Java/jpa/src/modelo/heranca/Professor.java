package modelo.heranca;

import javax.persistence.*;

@Entity
@DiscriminatorValue("professor")
public class Professor extends Pessoa {

    @Column
    private Double salario;

    public Professor() {

    }

    public Professor(String nome, Double salario) {
        super(nome);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{id=" + getId() + ", nome='" + getNome() + "', salario=" + salario + "}";
    }
}
