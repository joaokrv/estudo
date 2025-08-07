package lambdas.calculos;

public class CalculoMain {
    public static void main(String[] args) {

        Calculo soma = new Soma();
        Calculo mult = new Multiplicar();

        System.out.println(soma.executar(2, 5));
        System.out.println(mult.executar(2, 5));
    }
}
