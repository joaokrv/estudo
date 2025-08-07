package poo.heranca;

public class Heroi extends Jogador {

    public Heroi(String nome, int x, int y) {
        super(nome);
        this.x = 0;
        this.y = 0;
        this.hp = 100;
        this.atq = 10;
    }

    public boolean atacar(Jogador oponente){

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 2) {
            oponente.hp -= 2*atq;
            System.out.println("O herói " + nome + " atacou " + oponente.nome);
            return true;
        } else if (deltaX == 0 && deltaY == 1) {
            oponente.hp -= 2*atq;
            System.out.println("O herói " + nome + " atacou " + oponente.nome);
            return true;
        } if (deltaX == 2 && deltaY == 0) {
            oponente.hp -= 2*atq;
            System.out.println("O herói " + nome + " atacou " + oponente.nome);
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.hp -= 2*atq;
            System.out.println("O herói " + nome + " atacou " + oponente.nome);
            return true;
        } else {
            System.out.println("O ataque falhou!");
            return false;
        }
    }

    public String statusAtual(){
        String classe = "Herói";
        String buff = "Ataque x2";

        return "\n----------------\nNOME: " + nome + "\nHP: " + hp +
                "\nPOSIÇÃO X: " + x + "\nPOSIÇÃO Y: " + y +
                "\nCLASSE: " + classe + "\nBUFF: " + buff + "\n----------------\n";
    }
}
