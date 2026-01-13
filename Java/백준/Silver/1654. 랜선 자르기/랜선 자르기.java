import java.util.*;

class Main {
    static int[] arr;
    static long length = 0;
    
    public static void binary_search(long start, long end, int target) {
        if (start > end) {
            return;
        }
        long mid = (start + end) / 2;
        
        long cnt = 0;
        for (int i : arr) {
            cnt += i / mid ;
        }
        
        if (cnt >= target) {
            length = Math.max(length, mid);
            binary_search(mid+1, end, target);
        } else {
            binary_search(start, mid-1, target);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        
        arr = new int[K];
        for (int i=0; i<K; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        binary_search(1, arr[K-1], N);
        
        System.out.println(length);
    }
}