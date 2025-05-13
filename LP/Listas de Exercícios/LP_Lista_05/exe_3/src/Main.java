import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("digite um numero:");
        n1 = in.nextInt();
        n2 = 0;
        if (n2 == 0)
        {
            for(int i = 0; i<10; i++)
            {
                if(numbers[i] == n1)
                {
                    System.out.println("Valor encontrado na posição: " + i);
                    n2 = 2;
                    break;
                }
                if (numbers[i] != n1 && n2 != 2)
                {
                    n2 = 1;
                }
            }
        }
        if(n2 == 1)
        {
            System.out.println("numero não encontrado");
        }

    }
}