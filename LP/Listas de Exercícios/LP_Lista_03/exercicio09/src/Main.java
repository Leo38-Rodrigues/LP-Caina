import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double n1,n2,n3;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da n1:");
        n1 = in.nextDouble();
        System.out.println("Digite o valor de n2:");
        n2 = in.nextDouble();
        System.out.println("Digite o valor de n3:");
        n3 = in.nextDouble();

        if (n1 == n2 && n1 == n3)
        {
            System.out.println("Triangulo equilátero!");
        }
        else if (n1 == n2 && n1 != n3)
        {
            System.out.println("Triangulo isóceles!");
        }
        else if (n1 == n3 && n1 != n2)
        {
            System.out.println("Triangulo isóceles!");
        }
        else if (n2 == n3 && n1 != n2)
        {
            System.out.println("Triangulo isóceles!");
        }
        else if (n1 != n2 && n1 != n3 && n2 != n3)
        {
            System.out.println("Triangulo escaleno!");
        }
    }
}