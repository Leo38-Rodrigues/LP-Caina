import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1,n2;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do numero 01:");
        n1 = in.nextDouble();
        System.out.println("Digite o valor do numero 02:");
        n2 = in.nextDouble();
        if (n1 > n2)
        {
            System.out.println("n1:" + n1 + " é maior!");
        }
        else if (n2 > n1)
        {
            System.out.println("n2:" + n2 + " é maior!");
        }
        else if (n1 == n2)
        {
            System.out.println("Os numeros são iguais!");
        }
        else
        {
         System.out.println("Número invalido!");
        }
    }
}