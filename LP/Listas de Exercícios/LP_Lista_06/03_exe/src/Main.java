import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor de X (base): ");
        x = in.nextInt();
        System.out.println("Digite o valor de y (expoente): ");
        y = in.nextInt();
        if (y > 0)
        {
            System.out.println("A Potencia numero digitado é:\n" + calculaNumero(x,y));
        }
        else {
            System.out.println("numero zuado!");
        }
    }
    public static int calculaNumero (int numx,int numy){
        int result = 0;
        int vezes = numx;
        for(int j = numx; j<=numy; j++){
            result = vezes * numx;
            vezes = result;
        }
        return vezes;
    }
}