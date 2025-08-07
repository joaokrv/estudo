package spring.estagio.sbexercicios.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import spring.estagio.sbexercicios.model.entities.Produto;

public interface ProdutoRepository
        extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer> {

    Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

//  findByNomeContaining
//  findByNomeIsContaining
//  findByNomeContais

//  findByNomeStratsWith
//  findByNomeEndsWith

//  findByNomeNotContaining

    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    Iterable<Produto> searchByNomeLike(@Param("nome") String nome);
    
}
