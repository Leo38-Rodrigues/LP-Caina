import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int numero;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = in.nextInt();
        System.out.println("A soma de todos os numeros inteiros \nanteriores até o numero digitado é:\n" + calculaNumero(numero));
    }

    public static int calculaNumero (int num){
        int number = 0;
        int soma = 0;
        for(int i = 0; i<=num; i++){
            soma = i + number;
            number = soma;
        }
        return soma;
    }
}