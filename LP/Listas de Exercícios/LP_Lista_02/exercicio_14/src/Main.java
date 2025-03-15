import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1,n2,resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da base do Triangulo retângulo:");
        n1 = in.nextDouble();
        System.out.println("Digite a altura do triangulo retangulo:");
        n2 =in.nextDouble();
        resultado = (n1 * n2) / 2;
        System.out.println("A aréa do triangulo é: " + resultado);
    }
}