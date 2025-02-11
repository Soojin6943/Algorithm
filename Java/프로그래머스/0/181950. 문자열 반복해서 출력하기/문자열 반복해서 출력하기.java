import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for (int i=0; i<n; i++){
            // print는 자동 줄바꿈 X
            System.out.print(str);
        }
    }
}