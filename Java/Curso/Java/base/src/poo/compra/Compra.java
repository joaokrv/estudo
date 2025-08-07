package poo.compra;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Compra {

    DecimalFormat df = new DecimalFormat("R$ 0.##");
    private String cliente;
    ArrayList <Item> itens = new ArrayList<>();

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public String getTotal() {
        double tot = 0;
        for(Item item: itens){
            tot += item.getPreco() * item.getQnt();
        }
        return df.format(tot);
    }

    public void addItem(String nome, int qnt, double preco){
        this.addItem(new Item(nome, qnt, preco));
    }

    public void addItem(Item item){
        this.itens.add(item);
        item.compra = this;
    }
}
