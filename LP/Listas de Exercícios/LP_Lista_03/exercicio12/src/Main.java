import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double n1, n2, result;
        int option;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        n1 = in.nextDouble();
        System.out.println("Digite o segundo numero:");
        n2 = in.nextDouble();

        System.out.println("------------------------------\n" +
                "Menu:\n" +
                "    1. Soma\n" +
                "    2. Subtracao\n" +
                "    3. Multiplicacao\n" +
                "    4. Divisao\n" +
                "------------------------------");

        System.out.println("Escolha uma opção:");
        option = in.nextInt();

        switch (option)
        {
            case 1:
                result = n1 + n2;
                System.out.println("-----------------------\n" +
                        "Resultado: " + n1 + " + " + n2 + " = " + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println("-----------------------\n" +
                        "Resultado: " + n1 + " - " + n2 + " = " + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println("-----------------------\n" +
                        "Resultado: " + n1 + " x " + n2 + " = " + result);
                break;
            case 4:
                result = n1 / n2;
                System.out.println("-----------------------\n" +
                        "Resultado: " + n1 + " / " + n2 + " = " +  result);
                break;
        }

    }
}