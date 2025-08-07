package hash.EqualsHascode;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.setNome("Pedro");
        u1.setEmail("pedro123@gmail.com");

        Usuario u2 = new Usuario();
        u2.setNome("Pedro");
        u2.setEmail("pedro123@gmail.com");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

    }
}
