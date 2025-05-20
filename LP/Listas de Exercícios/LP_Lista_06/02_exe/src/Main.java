import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int numero;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = in.nextInt();
        System.out.println("O fatorial do numero digitado é:\n" + calculaNumero(numero));
    }
    public static int calculaNumero (int num){
        int result = 0;
        int vezes = 0;
        vezes = num * (num - 1);
        for(int j = (num - 2); j>0; j--){
            result = vezes * j;
            vezes = result;
        }
        return vezes;
    }
}