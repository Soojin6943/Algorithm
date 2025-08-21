import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        
        for (int i=0; i<k; i++){
            int n = sc.nextInt();
            if(n == 0){
                sum -= st.pop();
            } else {
                st.push(n);
                sum += n;
            }
        }
        
        System.out.println(sum);
    }
}