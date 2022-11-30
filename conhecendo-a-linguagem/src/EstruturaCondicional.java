public class EstruturaCondicional {
    public static void main(String[] args) {

        // se média for maior ou igual a sete >= 7 = aprovado
        // se não se media for maior ou igual a cinco >= 5 = recuperação
        // se não = reprovado

        /*
        double media = 8.1;

        if(media >= 7){
            System.out.println("Você foi Aprovado!");
        }else if(media >= 5){
            System.out.println("Você esta de Recuperação!");
        }else {
            System.out.println("Você foi Reprovado!");
        }
        */

        int mes = 5;
        switch (mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido!");
                break;
        }


    }
}
