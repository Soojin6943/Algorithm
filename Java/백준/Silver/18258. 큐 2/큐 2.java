import java.util.*;
import java.util.Deque;
import java.util.ArrayDeque;
import java.io.*;

class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i=0; i<N; i++) {
            String line = br.readLine();
            char c = line.charAt(0);
            
            if (c == 'p') {
                if (line.charAt(1) == 'u') {
                    int x = Integer.parseInt(line.substring(5));
                    dq.addLast(x);
                } else {
                    sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
                }
            } else if (c == 's') {
                sb.append(dq.size()).append('\n');
            } else if (c == 'e') {
                sb.append(dq.isEmpty() ? 1 : 0).append('\n');
            } else if (c == 'f') {
                sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append('\n');
            } else {
                sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append('\n');
            }
            
        }

        System.out.println(sb.toString());
    }
}