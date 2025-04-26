import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int n1;
        Scanner in = new Scanner(System.in);

        int loser = 0;
        for(int i = 1;i<=10;i++)
        {
            if(loser==0)
            {
                for(int j = 1;j<=10; j++)
                {
                    System.out.println(i + " x " + j + " = ");
                    System.out.println("Resposta:");
                    n1 = in.nextInt();
                    if(n1 != (i*j))
                    {
                        System.out.println("Você perdeu!");
                        loser = 1;
                        break;
                    }
                }
            }

        }
    }
}