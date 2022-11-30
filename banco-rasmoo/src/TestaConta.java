public class TestaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        Cliente primeiroCliente = new Cliente();

        primeiroCliente.nome = "Alexandre Rodrigues";
        primeiroCliente.cpf = "94852316104";
        primeiroCliente.profissao = "Programador";
        primeiroCliente.salario = 2000.0;

        primeiraConta.titular = primeiroCliente;

        primeiraConta.saldo = 1000.0;
        primeiraConta.numero = 123556;
        primeiraConta.agencia = 6630;

        System.out.println("Titular:" + primeiraConta.titular.nome);
        System.out.println("Agencia: " + primeiraConta.agencia + " Número: " + primeiraConta.numero);
        System.out.println("Saldo:" + primeiraConta.saldo);

    }
}
