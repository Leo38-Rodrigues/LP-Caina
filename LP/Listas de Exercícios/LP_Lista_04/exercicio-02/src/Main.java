import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int num;

        for (int i = 0; i <= 4; i++)
        {
            System.out.println("Digite um número inteiros:");
            num = in.nextInt();
            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

        }
        System.out.println("\nResultado:");
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
    }

}