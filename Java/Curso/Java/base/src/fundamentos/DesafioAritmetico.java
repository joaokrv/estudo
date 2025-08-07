package fundamentos;

public class DesafioAritmetico {
    public static void main(String[] args) {
        // Pre requ.: Utilizar a biblioteca Math / conhecimentos em CAST / conteudos vistos anteriormente
        // Resolver fórumla utilizando a variável video 44. Modulo 3 FUNDAMENTOS

        // num1, den1, res1
        // num2, den2, res2
        // denExpres 10 elevado a 3
        // resExpres1, resExpres2, resFinal

        int num1, den1, res1;

        num1 = (6 * (3 + 2));
        den1 = 3*2;
        res1 = (int) (Math.pow(num1, 2))/den1;

        int num2, den2, res2;

        num2 = (1-5) * (2-7);
        den2 = 2;
        res2 = (int) Math.pow(((double) num2 /den2), 2);

        int denExpres, resExpres1, resExpres2, resFinal;

        denExpres = (int) Math.pow(10, 3);
        resExpres1 = res1 - (res2);
        resExpres2 = (int) Math.pow(resExpres1, 3);
        resFinal = (resExpres2 / denExpres);

        System.out.println(resFinal);

    }
}
