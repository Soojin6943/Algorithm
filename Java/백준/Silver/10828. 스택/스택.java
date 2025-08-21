import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        Stack<Integer> st = new Stack<>();
        
        for (int i=0; i < n ; i++){
            String[] s = sc.nextLine().split(" ");
            if (s[0].equals("push")){
                st.push(Integer.parseInt(s[1]));
            } else if (s[0].equals("pop")){
                if (st.isEmpty()){
                    sb.append(-1);
                } else {
                    sb.append(st.pop());
                }
                sb.append("\n");
            } else if (s[0].equals("size")){
                sb.append(st.size()).append("\n");
            } else if (s[0].equals("empty")){
                if(st.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                if (st.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(st.peek()).append("\n");
                }
            }
            
        }
        System.out.print(sb);
    }
}