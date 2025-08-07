package modelo.teste.umpraum;

import modelo.infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
    public static void main(String[] args) {

        Assento assento = new Assento("27E");
        // Cliente cliente = new Cliente("Luismar", assento);
        Cliente cliente = new Cliente("Luismar", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);

        // dao.incluirAtomico(cliente); -> por existir um objeto (assento) no cliente,
        // e esse objeto nao esta salvo. Isso antes de setar o Cascade na tag @OneToOne
        // Após setar qual tipo é se torna possivel incluir o cliente

        dao.incluirAtomico(cliente);

        // com o assento null, o cliente pode ser criado. Assento não é obrigatório.
        // dao.incluirAtomico(cliente);
    }
}
