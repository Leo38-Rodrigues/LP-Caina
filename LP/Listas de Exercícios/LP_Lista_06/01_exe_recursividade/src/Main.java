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
        if (num > 0)
            num = num+calculaNumero(num-1);
        return num;
    }
}