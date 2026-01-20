import java.util.*;

class Main {
    
    public static int fin(int i) {
        if (i == 1 || i == 0) {
            return i;
        }
        return fin(i-1) + fin(i-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(fin(n));
        
    }
}