package poo.desafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public String toString(){
        return itens.toString();
    }

    public void addItem(Produto prod, int qnt) {
        this.itens.add(new Item(prod, qnt));
    }

    public void addItem(String nome, double preco, int qnt) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qnt));
    }

    public double totCompra() {
        double tot = 0;
        for (Item item: itens) {
            tot += item.prod.getPreco() * item.getQnt();
        }
        return tot;
    }

}
