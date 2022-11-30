public class TesteAbstract {
    public static void main(String[] args) {
        Cliente alexandre = new Cliente("Alexandre Rodrigues", "94852316104");
        ContaCorrente cc = new ContaCorrente(6630,134556,alexandre);

        cc.depositar(300);
        cc.gerarExtrato();
    }
}
