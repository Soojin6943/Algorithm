import java.util.*;

class Main {
    static int[] treeLength;
    static int cutting = 0;
    
    public static void binary_search(int start, int end, int target) {
        if (start > end) return;
        
        int mid = start + (end - start) / 2;
        long getTree = 0;
        
        for (int len : treeLength) {
            if (mid < len) {
                getTree += len - mid;
            }
        }
        
        if (getTree >= target) {
            cutting = Math.max(cutting, mid);
            binary_search(mid+1, end, target);
        } else {
            binary_search(start, mid-1, target);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 나무 길이 저장
        treeLength = new int[N];
        for (int i=0; i<N; i++) {
            treeLength[i] = sc.nextInt();
        }
        
        Arrays.sort(treeLength);
        
        binary_search(0, treeLength[treeLength.length-1], M);
        
        System.out.println(cutting);
    }
}