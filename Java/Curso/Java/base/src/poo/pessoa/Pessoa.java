package poo.pessoa;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;

    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 110) {
            this.idade = novaIdade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    @Override
    public String toString() {
        return "\nOlá, sou o " + getNome() + ", tenho " + getIdade() + " anos e " +
                "peso " + getPeso() + " KG.";
    }
}
