import java.util.*;

public class Main {
    static class Balloon {
        int num;
        int next;
        
        public Balloon(int n, int next) {
            this.num = n;
            this.next = next;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Balloon> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i=1; i<=N; i++) {
            int next = sc.nextInt();
            Balloon b = new Balloon(i, next);
            que.add(b);
        }
                
        while(!que.isEmpty()) {
            Balloon cur = que.pollFirst();
            sb.append(cur.num).append(" ");
            
            if (que.isEmpty()) break;
            
            if (cur.next > 0) {
                for (int i=0; i<cur.next - 1; i++) {
                    que.addLast(que.pollFirst());
                }
                continue;
            }
            
            if (cur.next < 0) {
                for (int i=cur.next; i<0; i++) {
                    que.addFirst(que.pollLast());
                }
                continue;
            }
        }
        
        System.out.println(sb);
    }
}