import java.util.Scanner;

class Main{
    public static int fac(int N) {
        if (N==0 || N == 1) {
            return 1;
        }
        
        return fac(N-1) * N;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int result = fac(N) / (fac(N-K) * fac(K));
        System.out.println(result);
    }
}