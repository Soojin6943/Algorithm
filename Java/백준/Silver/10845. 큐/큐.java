import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<N; i++){
            String n = sc.next();
                        
            if (n.equals("push")){
                int k = sc.nextInt();
                que.addLast(k);
            } else if (n.equals("pop")) {
                if (que.isEmpty()){
                    sb.append("-1").append("\n");
                } else {
                    sb.append(que.pollFirst()).append("\n");
                }
            } else if (n.equals("size")){
                sb.append(que.size()).append("\n");
            } else if (n.equals("empty")){
                sb.append(que.isEmpty() ? "1" : "0").append("\n");
            } else if (n.equals("front")){
                if(que.isEmpty()){
                    sb.append("-1").append("\n");
                } else {
                    sb.append(que.peekFirst()).append("\n");
                }
            } else if (n.equals("back")){
                if(que.isEmpty()){
                    sb.append("-1").append("\n");
                } else {
                    sb.append(que.peekLast()).append("\n");
                }
            }
        }
        
        System.out.print(sb);
    }
}