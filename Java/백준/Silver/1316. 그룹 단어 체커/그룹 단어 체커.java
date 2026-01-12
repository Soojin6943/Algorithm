import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        
        for (int i=0; i<N; i++) {
            String word = sc.nextLine();
            List<Character> contain = new ArrayList<>();
            Boolean groupWord = true;
            
            for (int j=0; j<word.length(); j++) {
                char c = word.charAt(j);
                if (!contain.contains(c)) {
                    contain.add(c);
                } else {
                    if (c != word.charAt(j-1)) {
                        groupWord = false;
                        break;
                    }
                }
            }
            
            if (groupWord) cnt ++;
        }
        
        System.out.println(cnt);
        
    }
}