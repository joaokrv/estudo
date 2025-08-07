package spring.estagio.sbexercicios.controllers;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import spring.estagio.sbexercicios.model.entities.Produto;
import spring.estagio.sbexercicios.model.repositories.ProdutoRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired // Persistencia de dados
    private ProdutoRepository produtoRepository;

//    @PostMapping
//    public @ResponseBody Produto newProduct(@RequestParam String nome,
//                                            @RequestParam double preco,
//                                            @RequestParam double desconto) {
//        Produto produto = new Produto(nome, preco, desconto);
//        produtoRepository.save(produto);
//        return produto;
//    }

    // @PostMapping
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/listar") // CUIDADO
    public Iterable<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> listarProdutoPorNome(@PathVariable String parteNome){
//        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
        return produtoRepository.searchByNomeLike(parteNome);
    }

    @GetMapping("/pagina/{numPag}/{qtdePag}")
    public Iterable<Produto> listarProdutoPorPag(@PathVariable int numPag, @PathVariable int qtdePag) {

        if (qtdePag >= 5) qtdePag = 5;

        PageRequest page = PageRequest.of(numPag, qtdePag);
        return produtoRepository.findAll(page);
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> listarProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

//    @PutMapping // alterar obj inteiro
//    public Produto alterarProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
//    }

    @DeleteMapping(path = "/{id}")
    public void deletarProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }
}
