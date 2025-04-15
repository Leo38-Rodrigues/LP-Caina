import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fah;
        Scanner in = new Scanner(System.in);

        for (int i = -80; i <= 80; i += 10) {
            fah = (1.8 * i) + 32;
            System.out.println("Celsius: " + i + " Fahreinheit: " + fah);
        }
    }
}