package poo.desafioHeranca;

public class Carro {

    public String marca;
    final public int VELOCIDADE_MAX = 150;
    int velAtual;
    private int velocidade = 5;

    public Carro(String marca, int velAtual) {
        this.marca = marca;
        this.velAtual = velAtual;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
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
        if (velAtual >= 5) {
            velAtual -= getVelocidade();
            System.out.println("Velocidade do carro diminuindo de " + getVelocidade() + " em " + getVelocidade());
            return "Velocidade atual:" + velAtual + "Km/h";
        } else {
            velAtual = 0;
            System.out.println("O carro parou!");
            return "Carro parou!";
        }
    }

    public String toString() {
        return "\n--------------\nMarca: " + marca + "\n" +
                "Velocidade Atual: " + velAtual + " Km/h\n--------------\n";
    }
}
