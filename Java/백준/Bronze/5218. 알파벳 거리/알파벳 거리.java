import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        char[] str1 = new char[0];
        char[] str2 = new char[0];

        for (int i = 0; i < t; i++) {
            String A1 = sc.next();
            str1 = A1.toCharArray();

            String A2 = sc.next();
            str2 = A2.toCharArray();

            System.out.print("Distances: ");
            for (int j = 0; j < A1.length(); j++) {
                if (str1[j]<=str2[j])
                    System.out.print((str2[j] - str1[j]) + " ");
                else
                    System.out.print((str2[j]+26 - str1[j]) + " ");
            }
            System.out.println();
        }

    }
}
