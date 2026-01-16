import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = sc.nextInt();
        int max = current;
        
        for (int i=1; i<n; i++) {
            int num = sc.nextInt();
            current = Math.max(num + current, num);
            max = Math.max(max, current);
        }
        
        System.out.println(max);
    }
}