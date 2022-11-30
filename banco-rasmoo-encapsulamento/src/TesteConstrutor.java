public class TesteConstrutor {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alexandre Rodrigues", "94852316104");
        Conta conta = new Conta(1575, 6630, cliente);

        System.out.println(conta.getTitular().getNome());
        conta.depositar(200.0);
        System.out.println(conta.getSaldo());

    }
}
