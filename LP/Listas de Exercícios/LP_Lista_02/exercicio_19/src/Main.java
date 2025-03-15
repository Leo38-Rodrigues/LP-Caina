import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        double a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        a = in.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = in.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = in.nextDouble();

        double delta = (b * b) - 4 * a * c;
        if (delta > 0) {
            // Duas soluções reais e distintas
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As soluções reais da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            // Uma única solução real
            double x = -b / (2 * a);
            System.out.println("A equação tem uma única solução real: x = " + x);
        } else {
            // Soluções complexas (quando delta é negativo)
            System.out.println("A equação não tem soluções reais.");
        }

    }
}