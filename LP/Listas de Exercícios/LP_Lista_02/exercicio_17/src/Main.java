import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1,n2,n3,resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial:");
        n1 = in.nextDouble();
        System.out.println("Digite a aceleração:");
        n2 = in.nextDouble();
        System.out.println("Digite o tempo do percurso:");
        n3 = in.nextDouble();
        resultado = n1 + n2 * n3;
        System.out.println("Sua velocidade é igual a:" + resultado + " m/s");
    }
}