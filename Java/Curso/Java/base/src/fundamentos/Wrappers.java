package fundamentos;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // byte - primitivo
        Byte b = 100;

        // shot - primitivo
        Short s = 1000;

        // int - primitivo
        Integer i = 10000;
        // Integer i = Integer.parseInt(in.next());

        // long - primitivo
        Long l = 100000L;

        // float
        Float f = 123.0f;
        System.out.println(f);

        // double
        Double d = 123.123123;
        System.out.println(d);

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(i * 3);
        System.out.println(l / 3);

        // boolean - primitivo
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        // char - primitivo
        Character c = '#';
        System.out.println(c.toString());
        System.out.println(c + "...");
    }
}
