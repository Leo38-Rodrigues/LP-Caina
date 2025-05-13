import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [][] A = {{1,2}, {3,4}, {5,6}};
        int [][] B = {{1,2}, {3,4}};
        int [][] matriz;
        int num;
        num = 0;
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                num = (A[i][j] * B[i][j]);

            }
        }




    }
}