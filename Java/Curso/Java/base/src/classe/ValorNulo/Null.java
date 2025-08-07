package classe.ValorNulo;

import classe.Data.Data;

public class Null {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!"));

        String s2 = Math.random() > 0.5 ? "Olá" : null;

        Data d1 = Math.random() > 0.5 ? new Data() : null;

        if(d1 != null) {
            d1.setDia(4);
            System.out.println(d1.formatacaoData());
        }

        if (s2 != null) {
            System.out.println(s2.concat(" !!!"));
        }
    }
}
