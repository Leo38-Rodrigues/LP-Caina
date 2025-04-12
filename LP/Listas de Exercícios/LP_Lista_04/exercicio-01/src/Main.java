import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int i = 0;
        double n1, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do numero:");
        n1 = in.nextDouble();
        System.out.println("A tabuada do numero " + n1 + " é: ");
        while(i<11)
        {
            result = i * n1;

            System.out.println(i + " x " + n1 + " = " + result);
            i++;
        }
    }
}