package poo.pessoa;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa("João", 19, 88.2);
        Comida ingrediente1 = new Arroz(0.5);
        Comida ingrediente2 = new Feijao(0.3);
        Comida sobremesa = new Sorvete(0.5);

        System.out.println(convidado);

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println(convidado);

        convidado.comer(sobremesa);

        System.out.println(convidado);
    }
}
