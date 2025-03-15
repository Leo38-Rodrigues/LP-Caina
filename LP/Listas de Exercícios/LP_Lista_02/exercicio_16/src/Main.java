import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1,n2,resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio da circuferencia do cone");
        n1 = in.nextDouble();
        System.out.println("Digite a altura do cone");
        n2 = in.nextDouble();
        resultado = 0.3333333333333333 * (3.14159 * (n1 * n1)) * n2;
        System.out.println("O volume do cone é: " + resultado);
    }
}