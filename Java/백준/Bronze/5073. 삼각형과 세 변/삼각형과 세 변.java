import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a==0 && b ==0 && c==0){
                break;
            }
            
            if (a < b){
                int temp = a;
                a = b;
                b = temp;
            }
            if (a < c){
                int temp = a;
                a = c;
                c = temp;
            }
            
            if (a >= (b+c)){
                sb.append("Invalid").append("\n");
                continue;
            } 
            if (a == b && b == c){
                sb.append("Equilateral").append("\n");
            } else if (a == b || b==c || a==c){
                sb.append("Isosceles").append("\n");
            } else if (a != b && b != c && a != c){
                sb.append("Scalene").append("\n");
            }
            
        }
        
        System.out.println(sb);
    }
}