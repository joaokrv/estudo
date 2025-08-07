package poo.compra;

public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();

        compra1.setCliente("João");
        compra1.addItem("Caneta", 5, 1.75);
        compra1.addItem("Lápis", 5, 1.25);
        compra1.addItem("Borracha", 5, 2.75);

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getTotal());

    }
}
