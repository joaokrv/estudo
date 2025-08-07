package lambdas.consumidor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 999.92, 0.15);
        Produto p2 = new Produto("Camiseta", 99.9, 0.25);
        Produto p3 = new Produto("Calça", 199, 0);
        Produto p4 = new Produto("Tenis", 389.92, 0.45);

        Consumer<Produto> print = p -> System.out.println(p.nome + "!!!");
        print.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

        produtos.forEach(print);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
