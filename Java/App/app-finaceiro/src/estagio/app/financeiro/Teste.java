package estagio.app.financeiro;


import estagio.app.Calculadora;
import estagio.app.calculo.CalculadoraImpl;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Teste {
    public static void main(String[] args) {

        Calculadora calc = ServiceLoader
                .load(Calculadora.class)
                .findFirst()
                .get();

        System.out.println(calc.soma(1 + 10));

        System.out.println(calc.getClass().getDeclaredFields()[1].getName());

        try {
            Field fieldId = CalculadoraImpl.class.getDeclaredFields()[1];
            fieldId.setAccessible(true);
            fieldId.set(calc, "def");
            fieldId.setAccessible(false);

            System.out.println(calc.getId());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
