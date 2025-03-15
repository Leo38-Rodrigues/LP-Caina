import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1,resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio da circuferencia");
        n1 = in.nextDouble();
        resultado = 3.14 * (n1 * n1);
        System.out.println("A aréa da circunfêrencia é: " + resultado);
    }
}