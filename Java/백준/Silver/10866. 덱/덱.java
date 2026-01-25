import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        Deque<Integer> que = new ArrayDeque<>();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<N; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            
            if (arr[0].equals("push_front")) {
                que.addFirst(Integer.parseInt(arr[1]));
            } else if (arr[0].equals("push_back")) {
                que.addLast(Integer.parseInt(arr[1]));
            } else if (arr[0].equals("pop_front")) {
                if (que.isEmpty()) sb.append(-1).append("\n");
                else sb.append(que.pollFirst()).append("\n");
            } else if (arr[0].equals("pop_back")) {
                if (que.isEmpty()) sb.append(-1).append("\n");
                else sb.append(que.pollLast()).append("\n");
            } else if (arr[0].equals("size")) {
                sb.append(que.size()).append("\n");
            } else if (arr[0].equals("empty")) {
                if (que.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (arr[0].equals("front")) {
                if (que.isEmpty()) sb.append(-1).append("\n");
                else sb.append(que.peekFirst()).append("\n");
            } else {
                if (que.isEmpty()) sb.append(-1).append("\n");
                else sb.append(que.peekLast()).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}