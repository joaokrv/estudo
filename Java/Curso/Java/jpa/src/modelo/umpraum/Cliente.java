package modelo.umpraum;

import javax.persistence.*;

@Entity
@Table (name = "clientes")
public class Cliente {

    // É mais comum o cliente obter o assento ou pelo assento obter o cliente?
    // Por ser pelo cliente que se obtem o assento, o @OneToOne fica na classe cliente!

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn (name = "assento_id", unique = true) // Mapeamento de colunas que são relacionadas
    private Assento assento; // assento_id

    public Cliente() {
    }

    public Cliente(String nome, Assento assento) {
        this.nome = nome;
        this.assento = assento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
