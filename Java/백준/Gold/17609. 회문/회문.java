import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++){
            String str = sc.nextLine();
            sb.append(check(str)).append("\n");
        }

        System.out.println(sb);
    }

    static int check(String s){
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                if (isPalindrom(s, left+1, right) || isPalindrom(s, left, right-1)) {
                    return 1;
                } else {
                    return 2;
                }
            }
        }

        return 0;
    }
    static boolean isPalindrom(String s, int left, int right){
        while (left<right){
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

}
