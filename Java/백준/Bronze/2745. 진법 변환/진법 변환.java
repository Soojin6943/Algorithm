import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        int b = sc.nextInt();
        
        int result = 0;
        
        for (int i=in.length()-1; i>=0; i--){
            char c = in.charAt(i);
            int num = 0;
            
            if(c >= 'A' && c <= 'Z') {
                num = c - 'A' + 10;
            } else {
                num = c - '0';
            }
            
            result += num*(Math.pow(b, in.length()-1-i));
        }
        
        System.out.println(result);
    }
}