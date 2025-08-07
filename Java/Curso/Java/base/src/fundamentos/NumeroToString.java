package fundamentos;

public class NumeroToString {
    public static void main(String[] args) {

        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());

        // GAMBIARRA
        System.out.println(("" + num1).length());
        System.out.println(("" + num2).length());
    }
}
