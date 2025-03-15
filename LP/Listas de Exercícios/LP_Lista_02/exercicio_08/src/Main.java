import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double number, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor em milimetro:");
        number = in.nextDouble();
        resultado = number * 25.4;
        System.out.println("Esse valor em polegada equivale a: " + resultado);
    }
}