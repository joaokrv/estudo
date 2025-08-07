package modelo.teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        em.detach(usuario); // --> elemento fica em estado NÃO GERENCIADO

        usuario.setNome("Joaquim Junior");

        em.merge(usuario);

        // dentro desse contexto transacional é necessário
        // chamar um merge para que seja feito um update/sincronização no db

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
