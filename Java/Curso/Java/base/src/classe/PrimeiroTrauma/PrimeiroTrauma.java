package classe.PrimeiroTrauma;

public class PrimeiroTrauma {

    // Ao deixa-lo static ele se torna uma variavel da classe
    // portanto pode-se usa-lo no main por ele também ser static
    static int a = 3;

    int b = 4;

    public static void main(String[] args) {

        PrimeiroTrauma p = new PrimeiroTrauma();
        // Ao criar uma instancia da classe, a partir dela consegue
        // ter o acesso a varivael a
        System.out.println(a);
        System.out.println(p.b);
    }
}
