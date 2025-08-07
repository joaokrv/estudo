package poo.desafioHeranca;

public class Porsche extends Carro implements Esportivo{

    private String nome;
    final int VELOCIDADE_MAX = 300;

    public Porsche(String marca, int velAtual, String nome) {
        super(marca, velAtual);
        this.nome = nome;
        setVelocidade(25);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void ligarTurbo() {
        setVelocidade(35);
        System.out.println("Turbo ligado!");
    }

    @Override
    public void desligarTurbo() {
        setVelocidade(25);
        System.out.println("Turbo deligado!");
    }

    @Override
    public int nivelAr() {
        return Esportivo.super.nivelAr();
    }

    public void acelerar() {
        if (velAtual + getVelocidade() > VELOCIDADE_MAX) {
            velAtual = VELOCIDADE_MAX;
            System.out.println("Limite atingindo!");
        } else {
            velAtual += getVelocidade();
            System.out.println("Velocidade do carro " + getNome() + " aumentando de " + getVelocidade() + " em " + getVelocidade());
        }
    }

    public String freiar() {
        if (velAtual >= 25) {
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
