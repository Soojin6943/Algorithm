import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // key : 카드 숫자, value : 해당 카드 개수
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<N; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int M = sc.nextInt();
        int[] arr = new int[M];
        
        for (int i=0; i<M; i++) {
            int key = sc.nextInt();
            arr[i] = map.getOrDefault(key, 0);
        }
        StringBuilder sb = new StringBuilder();
        
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        
        System.out.println(sb);
    }
}