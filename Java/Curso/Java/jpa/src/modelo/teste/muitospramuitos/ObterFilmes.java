package modelo.teste.muitospramuitos;

import modelo.infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

import java.util.List;

public class ObterFilmes {
    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.0);

        for (Filme filme : filmes) {
            System.out.println(filme.getNome() + " ==> " +filme.getNota());

            for (Ator ator: filme.getAtores()) {
                System.out.println(ator.getNome());
            }
        }
    }
}
