import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        int n1,n2,resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        n1 = in.nextInt();
        System.out.println("Digite a Segunda nota:");
        n2 =in.nextInt();
        resultado = (n1 + n2) / 2;
        System.out.println("Sua média é igual a:" + resultado);


    }
}