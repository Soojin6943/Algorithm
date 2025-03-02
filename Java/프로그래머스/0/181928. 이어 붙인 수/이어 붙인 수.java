class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str1 = ""; // 짝수
        String str2 = "";
        for (int n : num_list) {
            if (n % 2 == 0) {
                str1 += n + "";
            } else {
                str2 += n + "";
            }
        }
        
        answer = Integer.parseInt(str1) + Integer.parseInt(str2);
        return answer;
    }
}