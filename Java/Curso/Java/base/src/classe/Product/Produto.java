package classe.Product;

import java.text.DecimalFormat;

public class Produto {

    DecimalFormat df = new DecimalFormat("0.##");

    String nome;
    double preco;
    static double DESCONTO = 0.25;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String precoDescontado(){
        return "Preço do produto " + nome + " com desconto: " + df.format(preco * (1 - DESCONTO));
    }

    public String precoGerente (double descontoGerente) {
        return "Preço do produto " + nome + " com desconto de gerente: " + df.format(preco * (1 - (DESCONTO + descontoGerente)));
    }
}
