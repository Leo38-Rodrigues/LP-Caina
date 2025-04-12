import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int n1, n2, n3, n4, n5;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite 5 números inteiros:");
            n1 = in.nextInt();
            n2 = in.nextInt();
            n3 = in.nextInt();
            n4 = in.nextInt();
            n5 = in.nextInt();

            if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5)
            {
                menor = n1;
            }
            else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
                menor = n2;
            }
            else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
                menor = n3;
            }
            else if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
                menor = n4;
            }
            else if (n5 < n1 && n5 < n2 && n5 < n3 && n5 < n4) {
                menor = n5;
            }else {
                System.out.println("Numero invalido!");
            }


        System.out.println("\nResultado:");
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        }

    }

}