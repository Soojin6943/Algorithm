class Solution {
    public int solution(int number, int limit, int power) {
        // 1. 새로운 배열에 약수 개수 저장
        // 2. 공격력에 따른 철 무게 계산
        
        int result = 0;
        // 약수 개수 저장할 배열
        int[] num = new int[number + 1];
        
        for (int i=1; i<=number; i++){
            for (int j=i; j<=number; j+=i){
                num[j] ++;
            }
        }
        
        for(int n : num){
            if (n <= limit){
                result += n;
            } else {
                result += power;
            }
        }
        return result;
    }
}