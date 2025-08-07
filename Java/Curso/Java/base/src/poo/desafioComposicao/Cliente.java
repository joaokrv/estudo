package poo.desafioComposicao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    DecimalFormat df = new DecimalFormat("R$ 0.##");
    String nome;
    List <Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String totCompra(){
        double tot = 0;
        for (Compra compra: compras) {
            tot += compra.totCompra();
        }
        return df.format(tot);
    }
}
