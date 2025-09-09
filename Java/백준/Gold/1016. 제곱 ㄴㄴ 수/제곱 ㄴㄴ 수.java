import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        int size = (int)(max - min + 1);
        
        boolean[] arr = new boolean[size];
        
        for (int i=0; i<size; i++){
            arr[i] = true;
        }
        
        for (long i = 2; i<= (long)(Math.sqrt(max)); i++) {
            long sq = i*i;
            long start = ((min + sq - 1) / sq) * sq;
            for (long j = start ; j <= max ; j += sq){
                arr[(int)(j - min)] = false;
            }
        }
        
        int cnt=0;
        for (boolean b : arr){
            if(b) cnt ++;
        }
        
        System.out.println(cnt);
    }
}