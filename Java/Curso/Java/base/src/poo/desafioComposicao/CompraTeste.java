package poo.desafioComposicao;

public class CompraTeste {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Teste");

        System.out.println(cliente1.totCompra());

        Compra compra1 = new Compra();
        compra1.addItem("Caneta", 2.5, 10);
        compra1.addItem("Borracha", 1.5, 3);
        compra1.addItem(new Produto("Notebook", 1920.99),1);

        Compra compra2 = new Compra();
        compra2.addItem("Caderno", 9.5, 3);
        compra2.addItem(new Produto("Celular", 920.99),1);

        cliente1.compras.add(compra1); // importante
        System.out.println(cliente1.totCompra());

        cliente1.compras.add(compra2); // importante
        System.out.println(cliente1.totCompra());

        System.out.println(cliente1.totCompra());

    }
}
