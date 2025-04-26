import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int n, n1, n2, soma;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero");
        n = in.nextInt();
        n1 = 0;
        n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 0; i<(n - 2); i++)
        {

            soma = (n1 + n2);
            System.out.println(soma);
            if(soma == (n1 + n2))
            {
                n1 = n2;
                n2 = soma;
            }
        }
    }
}