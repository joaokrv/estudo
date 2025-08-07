package modelo.teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Joaquim");

        // em.merge(usuario); --> elemento fica em estado GERENCIADO
        // dentro de um contexto transacional não é necessário
        // chamar um merge para que seja feito um update no db

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
