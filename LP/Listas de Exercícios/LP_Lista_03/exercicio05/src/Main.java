import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1,n2, media;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do numero 01:");
        n1 = in.nextDouble();
        System.out.println("Digite o valor do numero 02:");
        n2 = in.nextDouble();
        media = (n1 + n2) / 2;
        if (media >= 8.5)
        {
            System.out.println(media);
            System.out.println("A");
        }
        else if (media >= 7 && media < 8.5)
        {
            System.out.println(media);
            System.out.println("B");
        }
        else if (media >= 5 && media < 7)
        {
            System.out.println(media);
            System.out.println("C");
        }
        else
        {
            System.out.println(media);
            System.out.println("D");
        }

    }
}