import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double n1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero do dia da semana:");
        n1 = in.nextDouble();

        if (n1 == 1)
        {
            System.out.println("Domingo");
        }
        else if (n1 == 2)
        {
            System.out.println("Segunda-feira");
        }
        else if (n1 == 3)
        {
            System.out.println("Terça-feira");
        }
        else if (n1 == 4)
        {
            System.out.println("Quarta-feira");
        }
        else if (n1 == 5)
        {
            System.out.println("Quinta-feira");
        }
        else if (n1 == 6)
        {
            System.out.println("Sexta-feira");
        }
        else if (n1 == 7)
        {
            System.out.println("Sábado");
        }
        else
        {
            System.out.println("Numero invalido!");
        }



    }
}