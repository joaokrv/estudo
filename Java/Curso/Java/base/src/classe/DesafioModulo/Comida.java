package classe.DesafioModulo;

public class Comida {

    private String nome;
    private double peso;

    public Comida(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
