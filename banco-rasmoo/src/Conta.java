public class Conta {

    int agencia;
    int numero;
    Cliente titular;
    double saldo;

    void depositar(double valor){
        saldo += valor;
    }

    boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    void transferir(double valor, Conta destino){
        if(this.saldo >= valor){
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

}
