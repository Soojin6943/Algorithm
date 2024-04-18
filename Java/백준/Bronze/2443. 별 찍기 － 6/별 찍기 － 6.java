import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 2 * N; i += 2) {
            for (int j = 0; j <i/2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * N - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
