import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close();

        int result = A*B*C;
        String Sresult=Integer.toString(result);



        for (int i=0; i<10; i++){
            int cnt = 0;
            for (int j=0; j<Sresult.length(); j++){
                if (Sresult.charAt(j)-'0' == i)
                    cnt ++;
            }
            System.out.println(cnt);
        }
    }
}
