import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int option;
        double n1, n2, area, perimetro, raio, hipo;
        Scanner in = new Scanner(System.in);
        System.out.println("Menu:\n" +
                "    1. Círculo\n" +
                "    2. Triangulo Retângulo\n" +
                "    3. Retângulo\n" +
                "--------------------------\n" +
                "Escolha uma opção:");
        option = in.nextInt();

        switch (option)
        {
            case 1:
                System.out.println("Informe a base: ");
                n1 = in.nextDouble();
                System.out.println("Informe a Altura: ");
                n2 = in.nextDouble();

                raio = n1 / 2;
                area =  3.14 * (raio*raio);
                perimetro = 2 * 3.14 * raio;
                System.out.println("--------------------------\n" +
                        "Área = " + area + "\n" +
                        "Perímetro = " + perimetro);
                break;
            case 2:
                System.out.println("Informe a base: ");
                n1 = in.nextDouble();
                System.out.println("Informe a Altura: ");
                n2 = in.nextDouble();

                hipo = (n1 * n1) + (n2 * n2);
                area =  (n1 * n2) / 2;
                perimetro = n1 + n2 + Math.sqrt(hipo);
                System.out.println("--------------------------\n" +
                        "Área = " + area +
                        "\nPerímetro = " + perimetro);
                break;
            case 3:
                System.out.println("Informe a base: ");
                n1 = in.nextDouble();
                System.out.println("Informe a Altura: ");
                n2 = in.nextDouble();

                area =  n1 * n2;
                perimetro = (n1 + n2) * 2;
                System.out.println("--------------------------\n" +
                        "Área = " + area + "\n" +
                        "Perímetro = " + perimetro);
                break;



        }
    }
}