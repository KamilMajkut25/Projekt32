import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę gwiazdek: ");
        int liczbaGwiazdek = scanner.nextInt();

        for (int i = liczbaGwiazdek; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = liczbaGwiazdek; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}