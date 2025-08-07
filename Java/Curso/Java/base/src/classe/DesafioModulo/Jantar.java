package classe.DesafioModulo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 22, 80.24);
        Comida c1 = new Comida("Strogonoff", 0.500);
        Comida c2 = new Comida("Arroz", 0.212);
        Comida c3 = new Comida("Batata Palha", 0.88);

        System.out.println(p1.apresentar());

        p1.comer(c1);
        System.out.println(p1.apresentar());

        p1.comer(c2);
        System.out.println(p1.apresentar());

        p1.comer(c3);
        System.out.println(p1.apresentar());


    }
}
