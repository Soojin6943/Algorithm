import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] mem = new int[12];
        mem[0] = 0;
        mem[1] = 1;
        mem[2] = 2;
        mem[3] = 4;
        
        for (int t=0; t<T; t++){
            int n = sc.nextInt();
           
            for(int i=4; i<=n; i++){
                mem[i] = mem[i-1] + mem[i-2] + mem[i-3];
            }
            
            System.out.println(mem[n]);
        }
    }
}