import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        int[] cnt = new int[8001];
        int sum = 0;
        for (int i=0; i<N; i++){
            int n = sc.nextInt();
            arr[i] = n;
            sum += n;
            cnt[n+4000]++;
        }
        
        Arrays.sort(arr);
        
        // 최빈값
        int maxV = 0;
        for (int i : cnt){
            maxV = Math.max(maxV, i);
        }
        
        ArrayList<Integer> modeList = new ArrayList<>();
        for (int i=0; i < 8001; i++){
            if (cnt[i] == maxV) {
                modeList.add(i - 4000);
            }
        }
        
        int mode = 0;
        if (modeList.size() > 1){
            mode = modeList.get(1);
        } else {
            mode = modeList.get(0);
        }
        
        System.out.println(Math.round((double)sum/N));
        System.out.println(arr[N/2]);
        System.out.println(mode);
        System.out.println(arr[N-1] - arr[0]);
    }
}