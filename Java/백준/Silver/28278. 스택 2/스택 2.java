import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> st = new ArrayDeque<>();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<N; i++){
            int order = sc.nextInt();
            
            if (order == 1) {
                int num = sc.nextInt();
                st.addLast(num);
            } else if (order == 2) {
                if (st.isEmpty()) sb.append("-1").append("\n");
                else sb.append(st.pollLast()).append("\n");
            } else if (order == 3) {
                sb.append(st.size()).append("\n");
            } else if (order == 4) {
                if (st.isEmpty()) sb.append("1").append("\n");
                else sb.append("0").append("\n");
            } else if (order == 5) {
                if (st.isEmpty()) sb.append("-1").append("\n");
                else sb.append(st.peekLast()).append("\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}