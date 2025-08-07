package modelo.teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Leo", "leo@lanche.com.br");

        em.getTransaction().begin();  //
        em.persist(novoUsuario);      // ---> INSERT
        em.getTransaction().commit(); //

        System.out.println("O ID gerado foi: " + novoUsuario.getId());

        em.close();
        emf.close();
    }
}
