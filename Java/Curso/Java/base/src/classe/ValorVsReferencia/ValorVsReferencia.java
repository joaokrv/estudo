package classe.ValorVsReferencia;

import classe.Data.Data;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; // Atribuição por valor (PRIMITIVO), sempre será passada uma cópia

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 5, 2023);
        Data d2 = d1; // Atribuição por referência (OBJETO), irá gerar impacto, muda a atribuição

        System.out.println(d1.formatacaoData());
        System.out.println(d2.formatacaoData());

        d1.setDia(31);
        d2.setMes(12);

        System.out.println(d1.formatacaoData());
        System.out.println(d2.formatacaoData());
    }
}
