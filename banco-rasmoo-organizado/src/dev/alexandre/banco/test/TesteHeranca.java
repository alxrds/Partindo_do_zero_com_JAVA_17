package dev.alexandre.banco.test;

import dev.alexandre.banco.model.Cliente;
import dev.alexandre.banco.model.ContaCorrente;

public class TesteHeranca {
    public static void main(String[] args) {

        Cliente alexandre = new Cliente("Alexandre Rodrigues", "94852316104");
        ContaCorrente cc = new ContaCorrente(6630, 134556, alexandre);

        cc.depositar(150);

        System.out.println(cc.getSaldo());

    }
}
