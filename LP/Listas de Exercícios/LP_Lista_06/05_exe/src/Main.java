import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        num = in.nextInt();
        busca(num, numbers);


    }
    public static int busca(int num, int[] numbers){
        int inicio = 0;
        int fim = numbers.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (numbers[meio] == num) {
                return meio;
            } else if (numbers[meio] < num) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}