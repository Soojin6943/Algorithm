import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> start = new ArrayDeque<>();
        Deque<Integer> left = new ArrayDeque<>();
        int pass = 1;
        boolean ok = true;
        
        for (int i=0; i<N; i++) {
            start.offer(sc.nextInt());
        }
        sc.close();
        
        while (!start.isEmpty()) {
            if (start.peekFirst() == pass) {
                start.pollFirst();
                pass++;
                continue;
            }
            
            if (!left.isEmpty() && left.peekLast() == pass) {
                left.pollLast();
                pass++;
                continue;
            }
            
            if (left.isEmpty() || start.peekFirst() < left.peekLast()){
                left.offer(start.pollFirst());
            } else {
                ok = false;
                break;
            }
        }
        
        System.out.println(ok ? "Nice" : "Sad");
    }
}