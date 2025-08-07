package poo.testes;

import poo.desafioHeranca.Astra;
import poo.desafioHeranca.Porsche;

public class CarroTeste {
    public static void main(String[] args) {

        poo.desafioHeranca.Carro c = new poo.desafioHeranca.Carro("Chevrolet", 50);
        poo.desafioHeranca.Porsche p = new Porsche("Porsche", 50, "Porsche 911 GTS");
        poo.desafioHeranca.Carro a = new Astra("Chevrolet", 50, "Astra");

        System.out.println(c);
        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        System.out.println(c);

        System.out.println(a);
        a.acelerar();
        a.acelerar();
        a.acelerar();
        a.acelerar();
        System.out.println(a);

        System.out.println(p);
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        System.out.println(p);

        c.freiar();
        c.freiar();
        c.freiar();
        c.freiar();
        c.freiar();
        c.freiar();
        c.freiar();
        c.freiar();
        c.freiar();
        c.freiar();
        c.freiar();
        System.out.println(c);

        a.freiar();
        a.freiar();
        a.freiar();
        a.freiar();
        a.freiar();
        a.freiar();
        a.freiar();
        a.freiar();
        a.freiar();
        a.freiar();
        System.out.println(a);

        p.freiar();
        p.freiar();
        p.freiar();
        p.freiar();
        p.freiar();
        p.freiar();
        p.freiar();
        System.out.println(p);

        p.ligarTurbo();
        p.acelerar();
        p.acelerar();
        System.out.println(p);
        p.desligarTurbo();
        p.freiar();
        p.freiar();
        System.out.println(p);

    }
}
