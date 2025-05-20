import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String palavra;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        palavra = in.next();
        System.out.println("A palavra digitada " + verificapalindromo(palavra));
    }
    public static String verificapalindromo (String palavra){
        String inversao = new StringBuilder(palavra).reverse().toString();
        String palindromo = "é um palindromo";
        String not = "não é um palindromo!";
        if(palavra.equals(inversao)){
            return palindromo;
        }
        else {
            return not;
        }
    }
}