package streams.desafioFilter;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFiltro {

    // filtro > 30% de desconto
    // filtro frete gratis
    // Mostrar em área de destaque

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.##");

        Produto p1 = new Produto("Celular", 999.99, 0.40, 0);
        Produto p2 = new Produto("Caderno", 18, 0.0, 10);
        Produto p3 = new Produto("Moletom", 289.90, 0.50, 0);
        Produto p4 = new Produto("Tenis", 589.90, 0.50, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

        // Desconto
        Function<Produto, Double> precoFinal =
                produto -> produto.getPreco() * (1-(produto.getDesconto()));


        // Filtro 30% desconto
        Predicate<Produto> desconto =
                produto -> produto.getDesconto() >= 0.3;
        // Function<Produto, String> desconto =
        //         produto -> produto.getDesconto() >= 0.3 ?
        //                 "\nPRODUTO " + produto.getNome().toUpperCase() + " ESTÁ EM SUPER PROMOÇÃO COM "
        //                         + produto.getDesconto()*100 + "% DE DESCONTO" : "";


        // Filtro frete grátis
        Predicate<Produto> frete =
                         produto -> produto.getFrete() == 0;
        // Function<Produto, String> frete =
        //         produto -> produto.getFrete() > 0 ?
        //                 "\nPRODUTO " + produto.getNome().toUpperCase() + " ESTÁ COM FRETE GRÁTIS" : "";


        // Produto relevante
        Predicate<Produto> relevante =
                produto -> produto.getPreco() >= 500;

        // Function map
        Function<Produto, String> produtoPromocional =
                produto -> "APROVEITE! " + produto.getNome().toUpperCase() +
                        " POR APENAS R$" + df.format(precoFinal.apply(produto));

        // Pipeline de execuções -> Sequencia de execuções
        produtos.stream()
                .filter(desconto)
                .filter(frete)
                .filter(relevante)
                .map(produtoPromocional)
                .forEach(System.out::println);
    }

}
