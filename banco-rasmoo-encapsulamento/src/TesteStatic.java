public class TesteStatic {
    public static void main(String[] args) {
        Cliente alexandre = new Cliente("Alexandre Rodrigues", "94852316104");

        Conta conta1 = new Conta(6630, 134556, alexandre);
        Conta conta2 = new Conta(6630, 134557, alexandre);
        Conta conta3 = new Conta(6630, 134558, alexandre);

        System.out.println(conta1.getTitular().getNome());
        System.out.println(Conta.getTotal());
    }
}
