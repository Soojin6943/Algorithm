import java.util.*; 

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int a = numbers[0] * numbers[1];
        int b = numbers[numbers.length-1] * numbers[numbers.length-2];
        answer = a > b ? a : b;
        
        return answer;
    }
}