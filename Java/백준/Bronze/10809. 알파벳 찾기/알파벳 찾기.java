import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int[] index = new int[26];
        for (int i=0; i<26; i++) {
            index[i] = str.indexOf('a' + i);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i : index) {
            sb.append(i).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}