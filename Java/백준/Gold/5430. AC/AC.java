import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<T; i++){
            StringBuilder sb = new StringBuilder();
            String str = sc.nextLine();
            int n = sc.nextInt();
            Deque<Integer> que = new ArrayDeque<>();

            sc.nextLine();
            String input = sc.nextLine();
            input = input.replace("[", "").replace("]", "");

            String[] s = input.split(",");
            int[] arr = new int[n];
            for (int j=0; j<n; j++){
                que.add(Integer.parseInt(s[j]));
            }

            boolean reverse = false;
            boolean isError = false;
            for(char c : str.toCharArray()){
                if (c == 'R'){
                    if (reverse){
                        reverse = false;
                    } else reverse = true;
                } else {
                    if (que.isEmpty()){
                        isError = true;
                        break;
                    }
                    if (reverse){
                        que.pollLast();
                    } else {
                        que.pollFirst();
                    }
                }
            }
            if (isError){
                System.out.println("error");
                continue;
            }

            List<Integer> list = new ArrayList<>();
            
            sb.append("[");
            if (reverse){
                while(!que.isEmpty()){
                    //list.add(que.pollLast());
                    sb.append(que.pollLast());
                    if (!que.isEmpty()) sb.append(",");
                }
            } else {
                while(!que.isEmpty()){
                    //list.add(que.pollFirst());
                    sb.append(que.pollFirst());
                    if (!que.isEmpty()) sb.append(",");
                }
            }
            sb.append("]");

            System.out.println(sb);
        }
    }
}