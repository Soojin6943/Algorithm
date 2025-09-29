import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i<N; i++){
            set.add(sc.nextLine());
        }
        for (int i=0; i<M; i++){
            String now = sc.nextLine();
            if (set.contains(now)){
                arr.add(now);
            }
        }
        
        System.out.println(arr.size());
        Collections.sort(arr);
        for (String s: arr){
            System.out.println(s);
        }
        
        
        
        
    }
}