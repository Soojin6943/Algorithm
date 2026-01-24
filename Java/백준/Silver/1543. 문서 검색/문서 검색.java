import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String check = sc.nextLine();
        
        int start = 0;
        int end = check.length();
        int result = 0;
        
        while (end <= str.length()) {
            String word = str.substring(start, end);
            
            if (word.equals(check)) {
                result ++;
                start = end;
                end += check.length();
            } else {
                start ++;
                end ++;
            }
        }
        
        System.out.println(result);
    }
}