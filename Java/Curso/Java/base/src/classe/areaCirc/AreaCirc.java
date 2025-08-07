package classe.areaCirc;

import java.text.DecimalFormat;

public class AreaCirc {

    DecimalFormat df = new DecimalFormat("0.##");

    double raio;
    final static double PI = 3.14;

    public AreaCirc (double raioInicial) {
        raio = raioInicial;
    }

    public String area() {
        return df.format(PI * Math.pow(raio, 2));
    }
}
