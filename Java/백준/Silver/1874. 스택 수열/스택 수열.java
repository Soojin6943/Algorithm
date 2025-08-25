import java.util.*;

public class Main{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int max = 1;
        st.push(0);
        
        for(int i=1; i<n+1; i++){
            int num = sc.nextInt();
            
            while (max <= num){
                st.push(max);
                max ++;
                sb.append("+").append("\n");
            }
            
            if (st.peek() == num){
                st.pop();
                sb.append("-").append("\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb.toString());
    }
}