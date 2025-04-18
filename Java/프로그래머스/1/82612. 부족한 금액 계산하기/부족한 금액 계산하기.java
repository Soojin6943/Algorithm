class Solution {
    public long solution(int price, int money, int count) {
        // int의 표현 범위는 약 20억 -> long 사용해야함
        
        long answer = 0;
        long sum = 0;
        
        for (int i=1; i<= count; i++){
            sum += price * i;
        }
        System.out.println(sum);
        if (sum > money) answer = sum - money;
        return answer;
    }
}