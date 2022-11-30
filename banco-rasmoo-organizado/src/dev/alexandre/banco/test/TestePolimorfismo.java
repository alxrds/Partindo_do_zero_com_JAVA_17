package dev.alexandre.banco.test;

import dev.alexandre.banco.model.Cliente;
import dev.alexandre.banco.model.ContaCorrente;

public class TestePolimorfismo {
    public static void main(String[] args) {

        Cliente alexandre = new Cliente("Alexandre Rodrigues", "94852316104");
        ContaCorrente cc = new ContaCorrente(6630, 134556, alexandre);
        ContaCorrente cp = new ContaCorrente(6630, 134556, alexandre);

        cc.depositar(782.29);
        cc.sacar(200);

        cp.depositar(785.52);
        cp.sacar(180);

        cc.transferir(50, cp);

        System.out.println("Saldo CC " + cc.getSaldo());
        System.out.println("Saldo CP " + cp.getSaldo());

        System.out.println(cc);
    }
}
