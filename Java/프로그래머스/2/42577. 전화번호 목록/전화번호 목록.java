import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashSet<String> set = new HashSet<>();
        
        for (int i=0; i<phone_book.length; i++) {
            set.add(phone_book[i]);
        }
        
        for (String number : set) {
            for (int i=1; i<number.length(); i++) {
                // 해시셋에 있으면 무언가의 접두어인 경우
                if (set.contains(number.substring(0, i))) return false;
                else continue;
            }
        }
        return answer;
    }
}