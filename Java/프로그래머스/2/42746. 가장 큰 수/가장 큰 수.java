import java.util.*;

class Solution {
    
    public String solution(int[] numbers) {
        String[] str = new String[numbers.length];
        
        // 문자열 배열로 변경
        for (int i=0; i<numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        
        // a+b 랑 b+a 비교하여 정렬
        Arrays.sort(str, (a, b) -> (b+a).compareTo(a+b));
        
        if(str[0].equals("0")){
            return str[0];
        } else {
            StringBuilder sb = new StringBuilder();
            
            for (int i=0; i<str.length; i++){
                sb.append(str[i]);
            }
            
            return sb.toString();
        }
    }
}