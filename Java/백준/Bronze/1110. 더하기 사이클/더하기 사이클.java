import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int N0 = N;
        int cnt = 0;
        do {
            int N1 = N0/10;
            int N2 = N0%10;
            N0 = N2*10 + (N1+N2)%10;
            cnt++;
        } while(N != N0);
            System.out.println(cnt);
    }
}