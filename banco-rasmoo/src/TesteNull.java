public class TesteNull {
    public static void main(String[] args) {
        Conta conta = new Conta();

        System.out.println(conta.agencia);
        System.out.println(conta.numero);
        System.out.println(conta.saldo);

        conta.titular = new Cliente();

        System.out.println(conta.titular.nome);
        System.out.println(conta.titular.cpf);
        System.out.println(conta.titular.profissao);
        System.out.println(conta.titular.salario);
    }
}
