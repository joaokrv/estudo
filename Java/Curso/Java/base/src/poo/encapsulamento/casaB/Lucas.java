package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Paulo;

public class Lucas {

    void testeAcessos() {
        Paulo colega = new Paulo();

        // todosSabem
        // idade
        // segredo
        // facoEmCasa

        //System.out.println(colega.segredo); // private
        //System.out.println(colega.colega.facoEmCasa); // package (apenas mesmo pacote)
        //System.out.println(colega.idade); // só consegue acessar via herança caso tenha o extends
        System.out.println(colega.todosSabem); // public
    }
}
