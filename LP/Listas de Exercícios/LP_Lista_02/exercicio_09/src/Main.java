import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double number, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor em quilometro:");
        number = in.nextDouble();
        resultado = number / 1.609;
        System.out.println("Esse valor em milhas equivale a: " + resultado);
    }
}