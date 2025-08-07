package generics.heranca;

public class Main {
    public static void main(String[] args) {

        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(123);

        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);

        // CaixaNums<String> caixaB = new CaixaNums<String>(); -> só aceita algo que extends Number

        CaixaNums<Double> caixaB = new CaixaNums<>();
        caixaB.guardar(2.2);

        System.out.println(caixaB.abrir());

        CaixaNums<Integer> caixaC = new CaixaNums<>();
        caixaC.guardar(1);

        System.out.println(caixaC.abrir());


    }
}
