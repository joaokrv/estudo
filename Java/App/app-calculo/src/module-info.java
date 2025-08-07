import estagio.app.Calculadora;
import estagio.app.calculo.CalculadoraImpl;

module app.calculo {
    exports estagio.app.calculo;

//    exports estagio.app.calculo.interno
//            to app.finaceiro;

    requires transitive app.logging;

    requires app.api; // Modulo
    provides estagio.app.Calculadora // provê a implementação para a calculadora
            with estagio.app.calculo.CalculadoraImpl;


    opens estagio.app.calculo to app.finaceiro;
    // open -> permite que seja usado o java reflection
    // (alteração de atributos privados)

}
