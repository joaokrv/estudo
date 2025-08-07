package poo.heranca;

public class Jogador {

    public String nome;
    protected int x, y;
    protected int hp;
    protected int atq;

    public Jogador (String nome, int x, int y){
        this.nome = nome;
        this.x = x;
        this.y = y;
        this.hp = 100;
        this.atq = 10;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean andar(Direcao direcao){
        if (x <= 50 && x >= -50 && y <= 50 && y >= -50) {
            switch (direcao) {
                case NORTE:
                    y--;
                    break;
                case SUL:
                    y++;
                    break;
                case LESTE:
                    x++;
                    break;
                case OESTE:
                    x--;
                    break;
                case null, default:
                    System.out.println("Insira uma direção válida");
                    return false;
            }
        } else {
            System.out.println("Insira uma direção válida");
            return false;
        }
        return true;
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
            System.out.println("O ataque falhou!");
            return false;
        }
    }

    public String statusAtual(){
        return "\n----------------\nNOME: " + nome + "\nHP: " + hp +
                "\nPOSIÇÃO X: " + x + "\nPOSIÇÃO Y: " + y + "\n----------------\n";
    }
}
