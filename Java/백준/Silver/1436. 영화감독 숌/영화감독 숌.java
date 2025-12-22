import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        int start = 666;
        int i = 1;
        
        while(N != i){
            start += 1;
            
            if (String.valueOf(start).contains("666")) {
                i++;
            }
        }
        
        System.out.println(start);
    }
}
