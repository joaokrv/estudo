package modelo.muitospramuitos;

import modelo.infra.DAO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double nota;

    @ManyToMany (cascade = CascadeType.PERSIST)
    @JoinTable (
            name = "atores_filmes",
            joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"), // id tabela filme
            inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id") // id tabela ator
    )
    private List<Ator> atores;

    public Filme() {
    }

    public Filme(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public List<Ator> getAtores() {
        if (atores == null) {
            atores = new ArrayList<>();
        }
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Filme filme = (Filme) o;
//        return Objects.equals(id, filme.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }

    public void addAtor(Ator ator) {
        if (ator != null && !getAtores().contains(ator)) {
            getAtores().add(ator);

            if (!ator.getFilmes().contains(this)) {
                ator.getFilmes().add(this);
            }
        }
    }

//    public void rmAtor(Ator ator) {
//        if (ator != null && getAtores().contains(ator)) {
//            getAtores().remove(ator);
//            ator.getFilmes().remove(this);
//        }
//    }

//    public void updateAtor(Long id, String novoNome) {
//        if (id == null || novoNome == null || novoNome.isBlank()) return;
//
//        DAO<Ator> dao = new DAO<>(Ator.class);
//        dao.abrirTransacao();
//
//        Ator ator = dao.obterPorId(id);
//        if (ator == null || !this.getAtores().contains(ator)) {
//            dao.fecharTransacao().fechar();
//            return;
//        }
//
//        ator.setNome(novoNome);
//
//        dao.fecharTransacao().fechar();
//    }

}
