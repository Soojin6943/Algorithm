class Solution {
    public int solution(int a, int b, int n) {
        
        // n개를 a로 나눴을 때 0 이면 나머지 만큼 바꿈
        // 나머지가 0이 아니면 몫만큼 바꾸고 나머지는 저장
        
        // 바꾼 음료 개수 + 저장된거 똑같이 계산
        // a 보다 작아질 때까지 계산
        
        int answer = 0;
        
        while (n >= a){
            if (n % a == 0){
                n = (n / a) * b;
                answer += n;
            } else {
                int plus = n % a; 
                n = (n / a) * b;
                  
                answer += n;
                n += plus;
            }
            
        }
        return answer;
    }
}