import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int i, n1, n2, n3, n4, n5;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 5 numeros:");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();
        n5 = in.nextInt();
        i = 0;

        while (i <= 5)
        {
            for(int = )
            if(i == n1 && n1<n2 && n1<n3 && n1<n4 && n1<n5)
            {
                System.out.println("numero menor é: " + n1);

            }
            else if (i == n2 && n2<n1 && n2<n3 && n2<n4 && n2<n5)
            {
                System.out.println("numero menor é: " + n2);

            }
            else if (i == n3 && n3<n1 && n3<n2 && n3<n4 && n3<n5)
            {
                System.out.println("numero menor é: " + n3);

            }
            else if (i == n4 && n4<n1 && n4<n2 && n4<n3 && n4<n5)
            {
                System.out.println("numero menor é: " + n4);
            }
            else if (i == n5 && n5<n1 && n5<n2 && n5<n3 && n5<n4)
            {
                System.out.println("numero menor é: " + n5);
            }
            else {
                System.out.println("");
            }
            i++;

        }

    }

}