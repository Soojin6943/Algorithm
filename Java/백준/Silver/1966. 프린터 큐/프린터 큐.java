import java.util.*;

public class Main{
    // deque에 [들어온 순서, 중요도]
    // 중요도 list 따로 관리
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                list.add(sc.nextInt());
            }

            
            Deque<int[]> que = new ArrayDeque<>();
            for (int j=0; j<N; j++) {
                que.add(new int[]{j, list.get(j)});
            }
            
            Collections.sort(list,Collections.reverseOrder());
            int idx = 0;
            int cnt = 0;
          
            while(true) {
                int[] print = que.pollFirst();
                if (print[1] < list.get(0)) {
                    que.addLast(print);
                } else {
                    list.remove(0);
                    cnt++;
                    
                    if (print[0] == M) {
                        sb.append(cnt).append("\n");
                        break;
                    } 
                }
            }
        }
        
        System.out.println(sb.toString());
    }
}