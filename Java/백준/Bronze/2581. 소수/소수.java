import java.util.Scanner;
public class Main {
    static boolean isPrime(int n){
        if (n == 1)
            return false;
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        int sum = 0;
        int m = -1;

        for (int i = N; i <= M; i++){
            if (isPrime(i)){
                sum += i;
                if (m == -1){
                    m = i;
                }
            }
        }
        if (sum != 0)
            System.out.println(sum);
        System.out.println(m);
    }
}
