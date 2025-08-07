package fundamentos;

import org.w3c.dom.ls.LSOutput;

public class TiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1.1231231232133333333; // implicita
        System.out.println(a);

        float b = (float) 1.12312312312312123; // explicita (CAST)
        System.out.println(b);

        int c = 127;
        byte d = (byte) c; // explicita (CAST)
        // byte d = c -> nao funciona, tipos diferentes independente do valor;
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e; // explicita (CAST)
        System.out.println(f);
    }
}
