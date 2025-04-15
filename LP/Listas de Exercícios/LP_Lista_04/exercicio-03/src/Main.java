public class Main {
    public static void main(String[] args)
    {
        int n1;

        for(int i=0; i<200; i++){
            n1 = i % 4;
            if (n1 == 0)
            {
                System.out.println(i);
            }
            i++;
    }
    }
}