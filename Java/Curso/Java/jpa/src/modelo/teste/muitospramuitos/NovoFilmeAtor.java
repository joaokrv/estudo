package modelo.teste.muitospramuitos;

import modelo.infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {

        Filme filmeA = new Filme("Como treinar seu dragão", 9.8);
        Filme filmeB = new Filme("Como treinar seu dragão 2", 9.9);
        Filme filmeC = new Filme("Como treinar seu dragão 3", 10.0);

        Ator atorA = new Ator("Soluço");
        Ator atorB = new Ator("Stoico");

        // Associa atores ao primeiro filme
        filmeA.addAtor(atorA);
        filmeA.addAtor(atorB);

        // Persistir primeiro filme (cascata salva os atores também)
        DAO<Filme> daoFilme = new DAO<>(Filme.class);
        daoFilme.abrirTransacao()
                .incluir(filmeA);
                daoFilme.fecharTransacao();

        // Atores com ID para buscar do banco
//        DAO<Ator> daoAtor = new DAO<>(Ator.class);
//        Ator atorA_db = daoAtor.obterPorId(atorA.getId());
//        Ator atorB_db = daoAtor.obterPorId(atorB.getId());
//        Ator atorC_db = daoAtor.obterPorId(atorC.getId());

        // Associa os mesmos atores ao segundo filme
        filmeB.addAtor(atorA);
        filmeB.addAtor(atorB);

        filmeC.addAtor(atorA);
        filmeC.addAtor(atorB);

        // Persiste o segundo filme usando MERGE
        daoFilme.abrirTransacao();
        daoFilme.incluir(filmeB);
        daoFilme.incluir(filmeC);
        daoFilme.fecharTransacao().fechar();

    }
}
