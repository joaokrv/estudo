package poo.desafioComposicao;

public class Item {

    private int qnt;
    Produto prod;

    public Item(Produto prod, int qnt) {
        this.prod = prod;
        this.qnt = qnt;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    @Override
    public String toString() {
        return prod.getNome() + " " + prod.getPreco() + " " + getQnt();
    }
}
