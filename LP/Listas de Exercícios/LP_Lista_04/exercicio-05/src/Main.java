import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int n, fatorial;
        Scanner in = new Scanner(System.in);
        fatorial = 1;
        System.out.println("Digite um numero: ");
        n = in.nextInt();

        System.out.println(n + "! = " );

        while (n>1)
        {
            fatorial = fatorial * n;
            n--;
        }
        System.out.println(fatorial);

    }
}