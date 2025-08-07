package poo.pessoa;

public class Sorvete extends Comida{

    private double peso;

    public Sorvete (double peso) {
        super(peso);
    }

    public void comer(Sorvete sorvete) {
        this.peso += sorvete.getPeso();
    }
}
