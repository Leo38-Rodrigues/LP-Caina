public class Main {
    public static void main(String[] args)
    {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<=9; i++)
        {
            if(numbers[i]%2 == 0 )
            {
                if(numbers[i] == 1 )
                {
                    numbers[i] = numbers[i] * 2;
                    System.out.println(numbers[i]);
                }
                else
                {
                    numbers[i] = numbers[i] + 2;
                    System.out.println(numbers[i]);
                }
            }
            else
            {
                numbers[i] = numbers[i] * 2;
                System.out.println(numbers[i]);
            }
        }
    }
}