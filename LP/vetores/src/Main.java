import java.sql.SQLOutput;
import java.util.zip.ZipEntry;

public class Main {
    public static void main(String[] args)
    {
        // DECLARAÇÃO DE VETOR SEM INICIALIZAÇÃO;
        int [] numbers = new int[5];
        numbers[0] = 0;
        numbers[1] = 6;
        numbers[2] = 5;
        numbers[3] = 2;


        // DECLARAÇÃO DE VETOR COM INICIALIZAÇÃO;
        int [] numbers2 = {0,6,5,2,1};
        numbers[4] = numbers2[4];

        // EXIBIÇÃO DE VALORES DE CADA POSIÇÃO DO VETOR
        for(int i = 0; i<5; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("--------------------");

        // numbers.length RETORNA O NUMERO DE POSIÇÕES NO VETOR
        System.out.println("NUMERO DE POSICOES NO VETOR: " + numbers.length);
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("--------------------");

        // FOREACH
        for(int pointer:numbers){
            System.out.println(pointer);
        }


        // MATRIZ DIMENSIONAL É DEFINIDA COM DOIS CAMPOS
        // DECLARAÇÃO DE MATRIZ SEM INICIALIZAÇÃO
        int [][] matriz = new int [2][2];

        // DECLARAÇÃO DE MATRIZ COM INICIALIZAÇÃO
        int [][] matriz2 = {{5,8,9},{9,6,5},{2,3,4}};

        System.out.println("--------------------");


        // matriz.length EXIBI O NUMERO DE LINHAS
        // matriz[1].length EXIBI O NUMERO DE COLUNAS

        // EXIBIÇÃO DE VALORES DA MATRIZ EM ORDEM
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("--------------------");

        // EXIBIÇÃO DE VALORES DA MATRIZ EM ORDEM COM matriz.length
        for (int i=0; i<matriz2.length; i++){
            for(int j=0; j<matriz2[1].length; j++){
                System.out.println("LINHA " + i + " COLUNA " + j + ": " + matriz2[i][j]);
            }
        }





    }
}