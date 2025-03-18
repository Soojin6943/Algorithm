class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        // n을 10으로 나눈 몫을 음료수 k에서 뺌
        answer = (12000 * n) + ((k - (n/10)) * 2000);
        return answer;
    }
}