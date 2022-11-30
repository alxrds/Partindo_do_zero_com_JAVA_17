public class VariaveisBooleanas {
    public static void main(String[] args) {

        // Operadores igualdade -> igual == diferente !=
        // Operadores relacionais -> maior > maior igual >= menor < menor igual <=
        // Operadores lógicos e && ou ||

        boolean usuarioAtivo = true;
        int idadeAlexandre = 41;

        System.out.println(usuarioAtivo);
        System.out.println(idadeAlexandre < 18);
        System.out.println(idadeAlexandre < 18 && usuarioAtivo);
        System.out.println(idadeAlexandre < 18 || usuarioAtivo);

    }
}
