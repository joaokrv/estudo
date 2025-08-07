package poo.pessoa;

public class Feijao extends Comida{

    private double peso;

    public Feijao (double peso) {
        super(peso);
    }

    public void comer(Feijao feijao) {
        this.peso += feijao.getPeso();
    }
}
