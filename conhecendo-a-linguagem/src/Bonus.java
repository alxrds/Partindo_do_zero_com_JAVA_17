import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        // Faca um programa que receba como entrada um valor que represente uma
        // temperatura em graus Celsius e imprima esse valor convertido em
        // Kelvin e Fahrenheit

        // K = C + 273.15
        // F = C * 1.8 + 32

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus celsius: ");

        double temperaturaCelsius = scanner.nextDouble();

        double kelvin = temperaturaCelsius + 273.15;
        double fahrenheit = temperaturaCelsius * 1.8 + 32;

        System.out.println("A temperatura em kelvin é: " + kelvin);
        System.out.println("A temperatura em fahrenheit é: " + fahrenheit);

    }
}
