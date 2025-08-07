package poo.pessoa;

public abstract class Comida {

    // ABSTRACT = não pode ser instanciada
    private double peso;

    public Comida(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
