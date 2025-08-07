package modelo.teste.basico;

import modelo.basico.Produto;
import modelo.infra.ProdutoDAO;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto: produtos){
            System.out.println("ID:" + produto.getId() + "\nNome: " + produto.getNome());
        }

        double precoTotal = produtos.stream()
                .map(Produto::getPreco)
                .reduce(0.0, Double::sum);

        System.out.println("\nValor total: R$ " + precoTotal);
    }
}
