class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        int n = queue1.length;
        long sum1 = 0;
        long sum2 = 0;
        int[] arr = new int[n*2];
        for (int i=0; i<n; i++){
            sum1 += queue1[i];
            arr[i] = queue1[i];
            sum2 += queue2[i];
            arr[n+i] = queue2[i];
        }
        
        if ((sum1 +sum2) % 2 != 0){
            return -1;
        }
        long half = (sum1 + sum2) / 2;
        
        int i = 0;
        int j = n;
        int cnt = 0;
        
        while (cnt < 3*n){
            if (half == sum1){
                return cnt;
            }
            
            if (sum1 < half){
                sum1 += arr[j % (2*n)];
                j++;
            } else if (sum1 > half){
                sum1 -= arr[i % (2*n)];
                i++;
            }
            cnt ++;
        }
        
        return -1;
    }
}