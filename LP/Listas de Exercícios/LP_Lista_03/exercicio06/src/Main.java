import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero entre 5 e 9:");
        n1 = in.nextDouble();
        if (n1 >= 5 && n1 <= 9)
        {
            System.out.println("Opção valida");
        }
        else
        {
            System.out.println("Opção invalida");
        }
    }
}