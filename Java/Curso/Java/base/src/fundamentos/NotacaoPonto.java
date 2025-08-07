package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.toUpperCase();
        s = s.replace("X", "Senhora");
        s = s.concat("!!!");
        System.out.println(s);

        String x = "l".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "João")
                .concat("!!!")
                .toUpperCase();
        System.out.println(y);

        // Tipos Primitivos não tem o operador "."

        int a = 3;
        System.out.println(a);
    }
}
