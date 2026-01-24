import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            int n = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<>(); // 의상 종류, 갯수
            sc.nextLine();
            
            for (int i=0; i<n; i++) {
                String[] wear = sc.nextLine().split(" ");
                map.put(wear[1], map.getOrDefault(wear[1], 0) + 1);
            }
            
            int result = 1;
            
            for (String str : map.keySet()) {
                result *= map.get(str) + 1;
            }
            
            sb.append(result - 1).append("\n");
        }
        
        System.out.println(sb);
    }
}