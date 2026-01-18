import java.util.*;

class Main {
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
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        
        for (int[] ar : list) {
            System.out.println(ar[0] + " " + ar[1]);
        }
    }
}