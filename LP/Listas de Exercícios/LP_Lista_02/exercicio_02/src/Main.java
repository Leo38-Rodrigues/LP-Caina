import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        System.out.println("Digite um numero ae meu chapa");
        int number, resultado;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        resultado = number * number;
        System.out.println("O quadrado do seu numero é: " + resultado);
    }
}