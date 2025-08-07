package modelo.teste.muitospramuitos;

import modelo.conulta.NotaFilme;
import modelo.infra.DAO;

public class ObterMediaFilmes {
    public static void main(String[] args) {

        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("obterMediaNotaFilmes");

        System.out.println(nota.getMedia());

        dao.fechar();
    }
}
