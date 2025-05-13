import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [] numbers = new int[10];
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        for(int i = 0; i<10; i++)
        {
            System.out.println("Digite um numero:");
            numbers[i] = in.nextInt();
            if(numbers[i] > maior){
                maior = numbers[i];
            }
            if(numbers[i] < menor){
                menor = numbers[i];
            }
        }
        System.out.println("O NUMERO MAIOR É: " + maior);
        System.out.println("O MENOR NUMERO É: " + menor);


    }
}