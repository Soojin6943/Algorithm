import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Deque<Integer> que = new ArrayDeque<>();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<N; i++) {
            String str = sc.nextLine();
            String[] num = str.split(" ");
            int option = Integer.parseInt(num[0]);
            
            if (option == 1) {
                que.addFirst(Integer.parseInt(num[1]));
            } else if (option == 2) {
                que.addLast(Integer.parseInt(num[1]));
            } else if (option == 3 || option == 4) {
                if (que.isEmpty()) sb.append(-1).append("\n");
                else {
                    int r = option == 3 ? que.pollFirst() : que.pollLast();
                    sb.append(r).append("\n");
                }
            } else if (option == 5){
                sb.append(que.size()).append("\n");
            } else if (option == 6) {
                if (que.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (option == 7 ||option == 8) {
                if (que.isEmpty()) sb.append(-1).append("\n");
                else {
                    int r = option == 7 ? que.peekFirst() : que.peekLast();
                    sb.append(r).append("\n");
                }
            }
            
        }
        
        System.out.println(sb);
    }
}