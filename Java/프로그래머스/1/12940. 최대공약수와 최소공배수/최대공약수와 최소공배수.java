class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 유클리드호제법
        // 최소공배수 = 두 자연수 곱 / 최대 공약수
        // 최대공약수
        for (int i = m; i >=1; i--){
            if (n % i == 0 && m % i == 0){
                answer[0] = i;
                break;
            }
        }

        // 최소공배수
        answer[1] = (n*m)/answer[0];
        return answer;
    }
}