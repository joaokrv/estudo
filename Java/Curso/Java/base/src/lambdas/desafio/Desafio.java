package lambdas.desafio;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("R$ #.##");

        // Preço real a partir do produto (com desconto)
        Function<Produto, Double> precoFinal =
                produto -> (produto.getPreco() * ( 1 - produto.getDesconto()));

        // Calculo Imposto: preco >= 2500 (0.085) / preco < 2500 (0)
        UnaryOperator<Double> imposto =
                preco -> preco >= 2500 ? preco * 1.085 : preco;

        // Frete: preco >= 3000 (100) / preco < 3000 (50)
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;

        // Format: R$1234,56
        Function<Double, String> formt =
                preco -> (df.format(preco).replace(".",","));

        Produto p = new Produto("Celular", 3235.89, 0.13);

        String preco = precoFinal
                .andThen(imposto) // 1 º
                .andThen(frete) // 2º
                .andThen(formt) // 3º e 4º
                .apply(p); // valor

        System.out.println("Preço final: " + preco);
    }
}
