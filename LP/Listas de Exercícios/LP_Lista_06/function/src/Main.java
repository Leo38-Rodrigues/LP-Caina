import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
      // INICIALIZAÇÃO DO PROGRAMA, VARIAVEIS, SCANNER ETC.
        String name;
        int year;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        name = in.next();
        System.out.println("Digite o ano de nascimeento:");
        year = in.nextInt();

        gerarSaudacao(name,year);
        gerarMenu(name);
        System.out.println("\nExecuta outras açoes\n");
        gerarMenu(name);

        // AÇOES DO CODIGO


    }

    //FUNÇÃO MENU

    // public DETERMINA QUE EU POSSO ACESSAR ESSA FUNÇÃO EM OUTROS DIRETORIOS

    // private TAMBEM PODE SER USADA PARA FUNÇÃO E IMPOSSIBILITA O ACESSO EM OUTROS DIRETORIOS

    // void DETERMINA QUE A FUNÇAO NÃO TEM RETORNO, ELA EXECUTA E VOLTA PRO CODIGO PRINCIPAL
    // void NÃO RETORNA NADA PARA O main

    public static void gerarMenu(String name) {
        System.out.println("Menu");
        System.out.println("Opção 1");
        System.out.println("Opção 2");
        System.out.println("Opção 3");
    }
    public static void gerarSaudacao(String name, int year ){
        System.out.println("\nBem vindo zé ruéla de nome: " + name );
        System.out.println("sua idade é: " + calcularIdade(year) + " anos\n");
    }
    public static int calcularIdade(int year){
        int age;
        age = 2025 - year;
        return age;
    }
}