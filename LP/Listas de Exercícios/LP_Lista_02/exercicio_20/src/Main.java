import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double x1,x2, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor de x1: ");
        x1 = in.nextDouble();
        System.out.println("Digite o valor de x2: ");
        x2 = in.nextDouble();
        double a = 1;
        double b = -(x1 + x2);  // b = -(x1 + x2)
        double c = x1 * x2;
        System.out.println("a equação é " + a + "x^2 + (" + b + ")x + (" + c + ") = 0");

    }
}