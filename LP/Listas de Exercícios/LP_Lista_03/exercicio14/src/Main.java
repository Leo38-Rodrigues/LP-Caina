import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int option, parcela;
        double n1, n2, valor,taxa;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor da compra: ");
        n1 = in.nextDouble();
        System.out.println("----------------------------------\n" +
                "Menu:\n" +
                "    1. Débito\n" +
                "    2. Pix\n" +
                "    3. Crédito\n" +
                "----------------------------------\n" +
                "Escolha a forma de pagamento:");
        option = in.nextInt();

        switch (option)
        {
            case 1:
                valor = n1 - (n1 * 0.05);
                System.out.println("----------------------------------\n" +
                        "Débito selecionado\n" +
                        "----------------------------------\n" +
                        "Valor final da compra: " + valor);
                break;
            case 2:
                valor = n1 - (n1 * 0.10);
                System.out.println("----------------------------------\n" +
                        "Pix selecionado\n" +
                        "----------------------------------\n" +
                        "Valor final da compra: " + valor);
                break;
            case 3:

                System.out.println("----------------------------------\n" +
                        "Crédito selecionado\n" +
                        "----------------------------------\n" +
                        "Escolha o numero de parcelas: " );
                parcela = in.nextInt();
                if (parcela <= 4)
                {
                    taxa = n1 * 0.02;
                    valor = n1 + taxa;
                    System.out.println("Valor final da compra: " + valor);
                }
                else if (parcela >= 5 && parcela <= 10)
                {
                    taxa = n1 * 0.05;
                    valor = n1 + taxa;
                    System.out.println("Valor final da compra: " + valor);
                }
                else
                {
                    System.out.println("Não aceitamos essa quantidade de parcelas!");
                }

                break;


        }

    }
}