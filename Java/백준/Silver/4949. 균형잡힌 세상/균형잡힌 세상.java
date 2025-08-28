import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while (true){
            String s = sc.nextLine();
            if (s.equals(".")){
                break;
            }
            
            char[] c = s.toCharArray();
            Stack<Character> st = new Stack<>();
            boolean isB = true;
            
            for (int i=0; i<c.length; i++){
                if (c[i] == '(' || c[i] == '['){
                    st.push(c[i]);
                } else if (c[i] == ')'){
                    if (st.isEmpty() || st.peek() != '('){
                        isB = false;
                        break;
                    } else if (st.peek() == '('){
                        st.pop();
                    }
                } else if (c[i] == ']'){
                    if (st.isEmpty() || st.peek() != '['){
                        isB = false;
                        break;
                    } else if (st.peek() == '['){
                        st.pop();
                    }
                } 
                
            }
            if (!st.isEmpty()) isB = false;
                
            sb.append(isB ? "yes" : "no").append("\n");
        }
        
        System.out.println(sb.toString());
    }
}