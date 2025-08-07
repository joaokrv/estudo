package modelo.teste.umpraum;

import modelo.infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento {
    public static void main(String[] args) {

        Assento assento = new Assento("18E");
        Cliente cliente = new Cliente("Hudson", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao()
                .incluir(assento) // Inserir assento 1º
                .incluir(cliente) // Pois cliente precisa de um ID do assento
                .fecharTransacao()
                .fechar();
    }
}
