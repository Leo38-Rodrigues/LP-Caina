import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1,conta;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do numero:");
        n1 = in.nextDouble();
        if (n1 > 0)
        {
            conta = Math.sqrt(n1);
            System.out.println("A raiz quadrada do seu número é:" + conta);
        }
        else
        {
            System.out.println("Número invalido!");
        }
    }
}