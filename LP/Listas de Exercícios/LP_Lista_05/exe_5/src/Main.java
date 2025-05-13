import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] v2 = new int[10];
        int j = 9;
        for(int i = 0; i<10; i++)
        {
            v2[j] = v1[i];
            j = j-1;
        }
        System.out.println("V1 e v2");
        for (int l = 0; l<10; l++)
        {

            System.out.println(v1[l] + " e " + v2[l]);
        }
    }
}