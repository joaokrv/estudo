package exceptions.finaly;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println(3/in.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally #01");
        }

        try {
            System.out.println(3/in.nextInt());
        } finally {
            System.out.println("Finally #02");
        }

        System.out.println("FIM!");
    }
}
