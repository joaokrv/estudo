package array.Exercicio;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        DecimalFormat df = new DecimalFormat("0.##");

        notasAlunoA[0] = 8.8;
        notasAlunoA[1] = 2.8;
        notasAlunoA[2] = 9.8;

        System.out.println(Arrays.toString(notasAlunoA));

        double totAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length ; i++) {
            totAlunoA += notasAlunoA[i];
        }

        System.out.println(df.format(totAlunoA/ notasAlunoA.length));

        double[] notasAlunoB = { 6.9, 8.7, 5 };
        double totAlunoB = 0;
        for ( int i = 0; i < notasAlunoB.length ; i++) {
            totAlunoB += notasAlunoB[i];
        }

        System.out.println(df.format(totAlunoB / notasAlunoB.length));


    }
}
