import java.util.*;

class Solution {
    int max = 0;
    int[] dis;
    
    private void binary_search(int start, int end, int n) {
        if (start > end) return;
        int mid = start + (end - start)/2;
        
        int remove = 0;
        int last = 0;
        
        for (int i=0; i<dis.length; i++) {
            if (remove > n) break;
            
            if (dis[i] - last < mid) {
                remove ++;
            } else {
                last = dis[i];
            }
        }
        
        if (remove > n) {
            binary_search(start, mid-1, n);
        } else if (remove <= n) {
            max = Math.max(max, mid);
            binary_search(mid+1, end, n);
        }
    }
    public int solution(int distance, int[] rocks, int n) {
    
        Arrays.sort(rocks); // 2, 11, 14, 17, 21, 마지막 도착도 추가해야함
        dis = new int[rocks.length + 1];
        
        for (int i=0; i<rocks.length; i++) {
            dis[i] = rocks[i]; 
        }
        
        dis[rocks.length] = distance;
        
        binary_search(0, distance, n);
        
        return max;
    }
}