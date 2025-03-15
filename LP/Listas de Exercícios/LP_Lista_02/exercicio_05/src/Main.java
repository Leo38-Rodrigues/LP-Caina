import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double number, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma velocidade em Km/h:");
        number = in.nextDouble();
        resultado = number / 3.6;
        System.out.println("Essa velocidade em m/s é equivalente a: " + resultado);

    }
}