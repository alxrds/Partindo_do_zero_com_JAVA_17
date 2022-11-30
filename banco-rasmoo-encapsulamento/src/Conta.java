public class Conta {

    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;
    private static int total;

    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;

        Conta.total++;
    }

    void depositar(double valor){
        saldo += valor;
    }

    boolean sacar(double valor){
        if(this.saldo >= valor){
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

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia > 0){
            this.agencia = agencia;
        }

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getTotal(){
        return Conta.total;
    }

}
