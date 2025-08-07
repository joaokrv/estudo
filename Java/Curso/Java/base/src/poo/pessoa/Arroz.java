package poo.pessoa;

public class Arroz extends Comida{

    private double peso;

    public Arroz (double peso) {
        super(peso);
    }

    public void comer(Arroz arroz) {
        this.peso += arroz.getPeso();
    }
}
