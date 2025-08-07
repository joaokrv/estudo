package poo.abstrato;

public class TesteAbstract {
    public static void main(String[] args) {

        Animal c = new Cachorro();

        System.out.println(c.mover());
        System.out.println(c.mamar());
    }
}
