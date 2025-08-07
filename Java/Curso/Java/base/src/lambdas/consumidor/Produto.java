package lambdas.consumidor;

import java.text.DecimalFormat;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("R$ 0.##");
        double precoFinal = getPreco() * ( 1 - getDesconto());
        return "\nNome: " + getNome() + "\nPreço:" + df.format(precoFinal);
    }
}
