package poo.desafioHeranca;

public class Astra extends Carro {

    private String nome;
    final int VELOCIDADE_MAX = 180;

    public Astra(String marca, int velAtual, String nome) {
        super(marca, velAtual);
        this.nome = nome;
        setVelocidade(15);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void acelerar() {
        if (velAtual + getVelocidade() > VELOCIDADE_MAX) {
            velAtual = VELOCIDADE_MAX;
            System.out.println("Limite atingindo!");
        } else {
            velAtual += getVelocidade();
            System.out.println("Velocidade do carro aumentando de " + getVelocidade() + " em " + getVelocidade());
        }
    }

    public String freiar() {
        if (velAtual >= 15) {
            velAtual -= getVelocidade();
            System.out.println("Velocidade do carro " + getNome() + " diminuindo de " + getVelocidade() + " em " + getVelocidade());
            return "Velocidade atual:" + velAtual + "Km/h";
        } else {
            velAtual = 0;
            System.out.println("O carro parou!");
            return "Carro parou!";
        }
    }

    public String toString() {
        return "\n--------------\nCarro: " + getNome() + "\nMarca: " + marca +
                "\nVelocidade Atual: " + velAtual + " Km/h\n--------------\n";
    }
}
