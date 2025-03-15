import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        System.out.println("Digite um numero meu consagrado");
        int number, resultado;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        resultado = number / 5;
        System.out.println("A quinta parte de seu numero é: " + resultado);
    }
}