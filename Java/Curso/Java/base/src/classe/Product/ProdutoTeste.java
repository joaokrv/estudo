package classe.Product;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Celular", 987.22);
        var p2 = new Produto("Lápis", 2.75);

        System.out.println(p1.precoDescontado());

        Produto.DESCONTO = 0.5;

        System.out.println(p1.precoDescontado());

        System.out.println(p1.precoGerente(0.3));
    }
}
