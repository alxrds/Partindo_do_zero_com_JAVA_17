public class TesteRefencia {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();

        System.out.println(primeiraConta);

        Conta segundaConta = primeiraConta;

        System.out.println(segundaConta);

        primeiraConta.saldo = 1000.0;

        System.out.println(segundaConta.saldo);

        segundaConta.saldo = 450.0;

        System.out.println(primeiraConta.saldo);

        System.out.println(segundaConta.saldo);

    }
}
