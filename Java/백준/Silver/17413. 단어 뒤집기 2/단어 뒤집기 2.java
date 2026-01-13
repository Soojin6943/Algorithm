import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean change = true;
        Deque<Character> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);


            if (c == '<') {
                while (!dq.isEmpty()) {
                    sb.append(dq.pollLast());
                }
                change = false;
                sb.append(c);
            } else if (c == '>') {
                change = true;
                while (!dq.isEmpty()) {
                    sb.append(dq.pollFirst());
                }
                sb.append(c);
            } else if (c == ' ' && change) {
                while (!dq.isEmpty()) {
                    sb.append(dq.pollLast());
                }
                sb.append(" ");
            } else {
                dq.add(c);
            }
        }

        if (!dq.isEmpty()) {
            if (change) {
                while (!dq.isEmpty()) {
                    sb.append(dq.pollLast());
                }
            } else {
                while (!dq.isEmpty()) {
                    sb.append(dq.pollFirst());
                }

            }
        }

        System.out.println(sb.toString());
    }
}