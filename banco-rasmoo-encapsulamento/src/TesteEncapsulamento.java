public class TesteEncapsulamento {
    public static void main(String[] args) {

        Conta conta = new Conta(1575, 6630, new Cliente("Alexandre Rodrigues", "94852316104"));

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getSaldo());

        conta.depositar(1000);

        System.out.println(conta.getSaldo());

    }
}
