package generics.CaixaGeneric;

public class CaixaGenericsTeste {
    public static void main(String[] args) {

        CaixaGenerics<String> caixaA = new CaixaGenerics<>();
        caixaA.guardar("Olá!");
        // caixaA.guardar(2); -> nao é possivel, aceita apenas String ("").
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        CaixaGenerics<Double> caixaB = new CaixaGenerics<>();
        caixaB.guardar(2.2);
        // caixaB.guardar(2); -> nao é possivel, aceita apenas Double (1.1, 2.2,3.3).
        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
