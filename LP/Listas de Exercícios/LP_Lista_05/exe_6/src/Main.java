public class Main {
    public static void main(String[] args)
    {
        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num;
        for(int i = 0; i<=5; i++)
        {
            num = v1[9-i];
            v1[9-i] = v1[i];
            v1[i] = num;
        }
        for(int l = 0; l<10; l++)
        {
            System.out.println(v1[l]);
        }


    }
}