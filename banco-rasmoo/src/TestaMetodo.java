public class TestaMetodo {

    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.depositar(300);
        conta.depositar(500);
        conta.depositar(50.30);

        conta.sacar(200);

        System.out.println(conta.saldo);

    }
}
