package poo.testes;

import poo.heranca.Direcao;
import poo.heranca.Heroi;
import poo.heranca.Jogador;
import poo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Heroi("Pedro", 0, 1);
        Jogador j2 = new Monstro("João", 0, 3);

        System.out.print(j1.statusAtual());
        System.out.print(j2.statusAtual());

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.print(j1.statusAtual());
        System.out.print(j2.statusAtual());

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);

        j2.andar(Direcao.SUL);
        j2.andar(Direcao.SUL);
        j2.andar(Direcao.SUL);

        System.out.print(j1.statusAtual());
        System.out.print(j2.statusAtual());



    }
}
