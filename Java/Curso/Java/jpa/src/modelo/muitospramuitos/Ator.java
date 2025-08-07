package modelo.muitospramuitos;

import modelo.infra.DAO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name = "atores")
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany (mappedBy = "atores", cascade = CascadeType.PERSIST)
    private List<Filme> filmes = new ArrayList<>();

    public Ator() {
    }

    public Ator(String nome) {
        this.nome = nome;
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

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Ator ator = (Ator) o;
//        return Objects.equals(id, ator.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }

    public void addFilme(Filme filme) {
        if (filme != null && !filmes.contains(filme)) {
            filmes.add(filme);
            if (!filme.getAtores().contains(this)) {
                filme.getAtores().add(this);
            }
        }
    }

//    public void rmFilme(Filme filme) {
//        if (filme != null && filmes.contains(filme)) {
//            getFilmes().remove(filme);
//            filme.getAtores().remove(this);
//        }
//    }

//    public void updateFilme(Long id, String novoFilme, Double novaNota){
//        if (id == null || novoFilme == null || novoFilme.isBlank() || novaNota == null) return;
//
//        DAO<Filme> dao = new DAO<>(Filme.class);
//        dao.abrirTransacao();
//
//        Filme filme = dao.obterPorId(id);
//
//        if (filme != null) {
//            filme.setNome(novoFilme);
//            filme.setNota(novaNota);
//        }
//
//        dao.fecharTransacao()
//                .fechar();
//    }

}
