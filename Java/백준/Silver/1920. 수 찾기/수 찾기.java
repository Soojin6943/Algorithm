import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<N; i++){
            int num = sc.nextInt();
            set.add(num);
        }
        
        int M = sc.nextInt();
        for (int i=0; i<M; i++){
            int check = sc.nextInt();
            if (set.contains(check)){
                sb.append("1").append("\n");
            } else {
                sb.append("0").append("\n");
            }
        }
        
        System.out.println(sb.toString());
        
    }
}