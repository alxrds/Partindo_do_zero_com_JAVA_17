public class TesteMetodoReferencia {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar(1000);

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);

        primeiraConta.transferir(1200, segundaConta);

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);



    }
}
