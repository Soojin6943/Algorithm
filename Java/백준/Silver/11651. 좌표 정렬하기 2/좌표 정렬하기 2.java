import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<int[]> list = new ArrayList<>();
        
        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            list.add(new int[]{x, y});
        }
        
        Collections.sort(list, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        
        for (int[] i : list) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}