import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double number, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor em Celsius:");
        number = in.nextDouble();
        resultado = (number * 1.8) + 32;
        System.out.println("Esse valor em fahreinheit equivale a: " + resultado);
    }
}