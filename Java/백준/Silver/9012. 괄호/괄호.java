import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        
        for (int i=0; i<t; i++){
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            boolean isValid = true;
            
            for (int j=0; j<s.length(); j++){
                if (s.charAt(j)=='('){
                    st.push('(');
                } else {
                    if (st.isEmpty()){
                        isValid = false;
                        break;
                    }
                    st.pop();
                }
            }
            
            if (!st.isEmpty()){
                isValid = false;
            }
            
            System.out.println(isValid ? "YES" : "NO");
            
        }
    }
}