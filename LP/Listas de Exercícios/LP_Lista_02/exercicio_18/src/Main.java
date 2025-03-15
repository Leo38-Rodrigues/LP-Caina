import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        a = in.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = in.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("A equação tem infinitas soluções.");
            } else {
                System.out.println("A equação não tem solução.");
            }
        } else {
            // Calcula a solução x
            double x = -b / a;
            System.out.println("A solução da equação é: x = " + x);
        }

    }
}