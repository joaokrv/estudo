package poo.heranca;

public class Monstro extends Jogador {

    public Monstro(String nome, int x, int y) {
        super(nome);
        this.x = x;
        this.y = y;
        this.hp = 120;
        this.atq = 10;
    }

    public boolean atacar(Jogador oponente){

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.hp -= atq;
            System.out.println(nome + " atacou " + oponente.nome);
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            System.out.println(nome + " atacou " + oponente.nome);
            oponente.hp -= atq;
            return true;
        } else {
            System.out.println("O ataque de " + nome + "  falhou!");
            return false;
        }
    }

    public String statusAtual(){
        String classe = "Monstro";
        String buff = "+20% hp";
        return "\n----------------\nNOME: " + nome + "\nHP: " + hp +
                "\nPOSIÇÃO X: " + x + "\nPOSIÇÃO Y: " + y +
                "\nCLASSE: " + classe + "\nBUFF: " + buff + "\n----------------\n";
    }
}
