package poo.compra;

public class Item {

    public Compra compra;
    private String nome;
    private int qnt;
    private double preco;

    public Item(String nome, int qnt, double preco) {
        this.nome = nome;
        this.qnt = qnt;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
}
