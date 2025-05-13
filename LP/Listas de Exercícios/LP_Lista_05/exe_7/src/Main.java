import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [][] matriz = {{1,2,3,4,5},
                           {6,7,8,9,10},
                           {11,12,13,14,15},
                           {16,17,18,19,20},
                           {21,22,23,24,25}};
        int maior = Integer.MIN_VALUE;
        int maiorc = Integer.MIN_VALUE;
        int somalinha,somacoluna, num, num2, line, colun;

        num = 0;
        num2 = 0;
        line = 0;
        colun = 0;

        for(int l = 0; l<5; l++)
        {
            for(int c = 0; c<5; c++)
            {
                somalinha =  (num + matriz[l][c]);
                num = somalinha;
                if(somalinha > maior){
                    maior = somalinha;
                    line = l;
                }
            }
            num = 0;
        }


        for(int c = 0; c<5; c++)
        {
            for(int l = 0; l<5; l++)
            {
                somacoluna =  (num2 + matriz[l][c]);
                num2 = somacoluna;
                if(somacoluna > maiorc){
                    maiorc = somacoluna;
                    colun = c;
                }
            }
            num2 = 0;
        }
        System.out.println("A MAIOR LINHA É A " + line + " de valor: " + maior);
        System.out.println("A MAIOR COLUNA É A " + colun + " de valor: " + maiorc);

    }

}