public class TesteExceptions {
    public static void main(String[] args) {

        try{

            Cliente alexandre = new Cliente("Alexandre Rodrigues", "94852316104");
            Conta conta = new Conta(6630,134556,alexandre);
            conta.depositar(500);

            System.out.println(conta.getSaldo());

            conta.sacar(502);

            System.out.println("Saldo atual é :" + conta.getSaldo());

        }catch(RuntimeException ex){
            System.out.println("O erro gerado foi: " + ex.getMessage());
        }finally{
            System.out.println("Esse bloco sempre será executado!");
        }


    }
}
