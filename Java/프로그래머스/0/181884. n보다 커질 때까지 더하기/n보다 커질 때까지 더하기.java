class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i: numbers){
            if (answer > n) break;
            else {
                answer += i;
            }
        }
        return answer;
    }
}