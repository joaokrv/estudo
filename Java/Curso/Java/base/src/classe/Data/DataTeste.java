package classe.Data;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(1, 7, 2005);
        Data d2 = new Data(11, 7, 2025);
        Data d3 = new Data();

        System.out.println(d1.formatacaoData());
        System.out.println(d2.formatacaoData());
        System.out.println(d3.formatacaoData());
    }
}
