import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int cnt = 0;
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            String t = sc.next();
            t = t + t;
            if (t.indexOf(A) != -1){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}