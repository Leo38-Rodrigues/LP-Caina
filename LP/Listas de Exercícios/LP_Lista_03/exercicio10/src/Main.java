import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double n1,n2,n3;
        double[] vector;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da n1:");
        n1 = in.nextDouble();
        System.out.println("Digite o valor de n2:");
        n2 = in.nextDouble();
        System.out.println("Digite o valor de n3:");
        n3 = in.nextDouble();
        vector = {n1, n2, n3};

        if (n1 < n2 && n1 < n3)
        {
            if (n2 < n3)
            {
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }
            else
            {
                System.out.println(n1);
                System.out.println(n3);
                System.out.println(n2);
            }
        }
        else if (n2 < n1 && n2 < n3)
        {
            if (n1 < n3)
            {
                System.out.println(n2 + n1 + n3);
            }
            else
            {
                System.out.println((n2) + (n3) + (n1));
            }
        }
        else if (n3 < n1 && n3 < n2)
        {
            if (n1 < n2)
            {
                System.out.println(n3);
                System.out.println(n1);
                System.out.println(n2);
            }
            else
            {
                System.out.println(n3);
                System.out.println(n2;
                System.out.println(n1);
            }
        }
        else
        {
            if (n1 == n2 && n1 < n3 && n2 < n3)
            {
                System.out.println(n1 + n2 + n3);
            }
            else if (n1 == n3 & n1 < n2 && n3 < n2)
            {
                System.out.println(n1 + n3+ n2);
            }
            else if (n2 == n3 && n2 < n1 && n3 < n1)
            {
                System.out.println(n2 + n3+ n1);
            }
        }
    }
}