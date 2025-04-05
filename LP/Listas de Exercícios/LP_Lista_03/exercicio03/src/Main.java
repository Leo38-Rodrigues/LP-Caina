import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1,n2, media, media2;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do numero 01:");
        n1 = in.nextDouble();
        System.out.println("Digite o valor do numero 02:");
        n2 = in.nextDouble();
        media = (n1 + n2) / 2;
        media2 = media * 10;

        System.out.println(media2<50?"Reprovado":"Aprovado");

        if (media2 < 50)
        {
            System.out.println(media);
            System.out.println(media2);
            System.out.println("Reprovado!");
        }
        else if (media2 >= 50 )
        {
            System.out.println(media);
            System.out.println(media2);
            System.out.println("Aprovado!");
        }
        else
        {
            System.out.println(media);
            System.out.println(media2);
            System.out.println("invalido");
        }
    }
}