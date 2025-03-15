import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int number, resultado; // Define a variavel inteira
        Scanner in = new Scanner(System.in); //Configura o scanner //
        number = in.nextInt();   //recebe o valor do scanner in e atribui a variavel number//
        resultado = number * 2;
        System.out.println("o dobro do numero é: " + resultado);
    }
}