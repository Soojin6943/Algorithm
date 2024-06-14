import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] Array = new int[42];
        for (int i=0; i<Array.length; i++){
            Array[i] = 0;
        }

        for (int i=0; i<10; i++){
            int N = sc.nextInt();
            int result = N%42;
            Array[result] = 1;
        }

        int cnt = 0;
        for (int i=0; i<Array.length; i++){
            if (Array[i] == 1)
                cnt ++;
        }
        System.out.println(cnt);
    }
}
