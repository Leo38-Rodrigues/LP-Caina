import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int n1;
        boolean primo = true;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        n1 = in.nextInt();

      if (n1 <= 1){
          primo = false;
          System.out.println("Não é primo!");
      }
      else {
          for(int i = 2; i <= n1; i++){
              if(n1%2 == 0){
                  primo = false;
              }
          }
      }


      if(primo){
          System.out.println(n1 + " é primo");
      }
      else{
          System.out.println(n1 + " não é primo");
      }



    }
}