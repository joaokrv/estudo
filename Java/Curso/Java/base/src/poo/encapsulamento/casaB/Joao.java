package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Paulo;

public class Joao extends Paulo {


    void testeAcessos() {
        Paulo amigo = new Paulo();

        // todosSabem
        // idade
        // segredo
        // facoEmCasa

        // System.out.println(amigo.segredo); private
        // System.out.println(amigo.facoEmCasa); package (mesmo pacote)
        System.out.println(idade); // só consegue acessar via herança
        System.out.println(todosSabem); // public
    }

}
