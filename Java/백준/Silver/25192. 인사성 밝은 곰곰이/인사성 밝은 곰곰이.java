import java.util.Scanner;
import java.util.HashSet;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        int gomgom = 0;
        
        for(int i=0; i<N; i++) {
            String s = sc.next();
            
            if (s.equals("ENTER")){
                set.clear(); 
                continue;
            }
            if (!s.equals("ENTER")) {
                if (set.contains(s)) {
                    continue;
                }
                set.add(s);
                gomgom += 1;
            } 
        }
        
        System.out.println(gomgom);
    }
}