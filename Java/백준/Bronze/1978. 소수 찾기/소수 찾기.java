import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for (int i=0; i<N; i++){
            int num = sc.nextInt();

            if (num == 1)
                cnt ++;
            else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.print(N-cnt);
    }
}
