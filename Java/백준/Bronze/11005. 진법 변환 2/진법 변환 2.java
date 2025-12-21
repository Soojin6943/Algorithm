import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        if (N == 0) {
            System.out.print(0);
        }

        while (N > 0) {
            int i = N % B;

            if (i >= 10) {
                char c = (char)('A' + i - 10);
                sb.append(c);
            } else {
                sb.append((char)('0'+i));
            }

            N = N / B;
        }

        System.out.println(sb.reverse().toString());
    }
}
