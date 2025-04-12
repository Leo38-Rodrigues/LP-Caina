import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        double n1, troco;
        int option;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o dinheira:!");
        n1 = in.nextDouble();
        System.out.println("-----------------------\n" +
                "Menu:\n" +
                "    1. Café Expresso R$ 0,50\n" +
                "    2. Café Longo R$ 1,00\n" +
                "    3. Capuccino R$ 2,50\n" +
                "    4. Chocolate R$ 2,00");
        System.out.println("Escolha uma opção:");
        option = in.nextInt();

        switch(option)
        {
            case 1:
                System.out.println("Bebida selecionada: Café Expresso");
                if(n1 >= 0.5)
                {
                    troco = n1 - 0.5;
                    System.out.printf("Seu troco é: R$ %.2f", troco);
                }
                else
                {
                    System.out.println("Não há dinheiro o suficiente");
                }
                break;
            case 2:
                System.out.println("Bebida selecionada: Café Longo");
                if(n1 >= 1)
                {
                    troco = n1 - 1;
                    System.out.printf("Seu troco é: R$ %.2f", troco);
                }
                else
                {
                    System.out.println("Não há dinheiro o suficiente");
                }
                break;
            case 3:
                System.out.println("Bebida selecionada: Capuccino");
                if(n1 >= 2.50)
                {
                    troco = n1 - 2.50;
                    System.out.printf("Seu troco é: R$ %.2f", troco);
                }
                else
                {
                    System.out.println("Não há dinheiro o suficiente");
                }
                break;
            case 4:
                System.out.println("Bebida selecionada: Chocolate");
                if(n1 >= 2)
                {
                    troco = n1 - 2.50;
                    System.out.printf("Seu troco é: R$ %.2f", troco);
                }
                else
                {
                    System.out.println("Não há dinheiro o suficiente");
                }
                break;
        }

    }
}