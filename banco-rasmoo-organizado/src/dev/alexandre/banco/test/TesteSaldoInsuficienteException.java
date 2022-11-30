package dev.alexandre.banco.test;

import dev.alexandre.banco.model.Cliente;
import dev.alexandre.banco.model.Conta;

public class TesteSaldoInsuficienteException {
    public static void main(String[] args) {

        Cliente alexandre = new Cliente("Alexandre Rodrigues", "94852316104");
        Conta cc = new Conta(1575, 664311-8, alexandre);

        cc.depositar(500);

        cc.sacar(700);

        System.out.println(cc.getSaldo());

    }
}
