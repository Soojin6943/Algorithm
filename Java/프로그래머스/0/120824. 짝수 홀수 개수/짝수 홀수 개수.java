class Solution {
    public int[] solution(int[] num_list) {
        int a=0, b=0;
        
        for (int num : num_list) {
            if (num % 2 == 0) a += 1;
            else b+= 1 ;
        }
        
        int[] answer = {a, b};
        return answer;
    }
}