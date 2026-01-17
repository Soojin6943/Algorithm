import java.util.*;

public class Main{
    static int max = 0;
    static int[] house;
    
    public static void binary_search(int start, int end, int target) {
        if (start > end) {
            return;
        }
        int mid = start + (end - start) / 2;
        int last = house[0];
        int cnt = 1;
        
        // 해당 거리로 설치 가능한 집 개수 
        for (int h : house) {
            if (h - last >= mid) {
                last = h;
                cnt ++;
            }
        }
        
        if (cnt >= target) {
            max = Math.max(max, mid);
            binary_search(mid+1, end, target);
        } else {
            binary_search(start, mid-1, target);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        
        house = new int[N];
        for (int i=0; i<N; i++) {
            house[i] = sc.nextInt();
        }
        Arrays.sort(house);
        
        binary_search(1, house[N-1] - house[0], C);
        
        System.out.println(max);
    }
}