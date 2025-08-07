package classe.DesafioModulo;

import java.text.DecimalFormat;

public class Pessoa {

    private double peso;
    private String nome;
    private int idade;

    DecimalFormat df = new DecimalFormat("0.##");

    public Pessoa (String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.getPeso();
        }
    }

    public String apresentar(){
        return "Olá, eu sou " + nome + " e tenho " + df.format(peso) + " kg";
    }
}
