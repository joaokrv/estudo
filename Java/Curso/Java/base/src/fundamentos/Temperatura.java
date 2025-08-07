package fundamentos;

import java.text.DecimalFormat;

public class Temperatura {
    public static void main(String[] args) {
        // (ºF - 32) x 5/9 = °C
        final int AJUSTE = 32;
        final double COEF = 5.0/9.0;

        double fart = 86;
        double celsius = (fart - AJUSTE) * COEF;
        DecimalFormat df = new DecimalFormat("0.##");
        String cFormat = df.format(celsius) + " °C";
        System.out.println(cFormat);
    }
}