import java.util.Scanner;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        sc.nextLine();

        for (int i=0; i<N; i++){
            String st = sc.nextLine();
            map.put(st, 0);
        }

        for (int i=0; i<M; i++){
            String str = sc.nextLine();
            if (map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            }
        }

        int cnt = 0;
        for (String s : map.keySet()){
            cnt += map.get(s);
        }

        System.out.println(cnt);
    }
}