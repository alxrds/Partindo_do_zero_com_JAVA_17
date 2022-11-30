package dev.alexandre.banco.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void gerarExtrato(){
        System.out.println("Gerando Extrato Conta Poupança.");
    }

}
