import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double a,b,c,x1,x2,delta;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da a:");
        a = in.nextDouble();
        System.out.println("Digite o valor de b:");
        b = in.nextDouble();
        System.out.println("Digite o valor de c:");
        c = in.nextDouble();

        delta = (b * b) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta > 0)
        {
            System.out.println(delta);
            System.out.println(x1);
            System.out.println(x2);
            System.out.println("tem duas raizes!");
        }
        else if (delta < 0)
        {
            System.out.println(delta);
            System.out.println(x1);
            System.out.println(x2);
            System.out.println("não tem raizes");
        }
        else
        {
            System.out.println(delta);
            System.out.println(x1);
            System.out.println(x2);
            System.out.println("Tem uma raiz!");
        }


    }
}