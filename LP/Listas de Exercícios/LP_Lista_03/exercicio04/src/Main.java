import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1,n2, media, media2, recuperacao;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do numero 01:");
        n1 = in.nextDouble();
        System.out.println("Digite o valor do numero 02:");
        n2 = in.nextDouble();
        media = (n1 + n2) / 2;

        if (media > 50)
        {
            System.out.println(media);
            System.out.println("Aprovado!");
        }
        else
        {

            System.out.println("Qual a nota da prova de recuperação?");
            recuperacao = in.nextDouble();
            media = (media + recuperacao) / 2;
            if (media > 50 )
            {
                System.out.println(media);
                System.out.println("Aprovado!");
            }
            else
            {
                System.out.println(media);
                System.out.println("Reprovado!");
            }
        }

    }
}