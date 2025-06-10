import java.util.*;
class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        // 해시맵 <조직원 , 추천인>
        // 해시맵 <조직원 , 수익>
        // 추천인이 있으면 판매 금액 10퍼 주기
        // 그 추천인 타고 들어가서 다시 추천인 조회 후 판매 금액 10퍼 주기
    
        HashMap<String, String> parent = new HashMap<>();
        for (int i=0; i<enroll.length; i++){
            // 키 = 조직원, 값 = 추천인
            parent.put(enroll[i], referral[i]);
        }
    
        // 키 = 조직원, 값 = 수익
        HashMap<String, Integer> total = new HashMap<>();
    
        for (int i=0; i<seller.length; i++){
            String curName = seller[i];
            int money = amount[i] * 100;
            
            while (money >= 1 && !curName.equals("-")){
                total.put(curName, total.getOrDefault(curName, 0) + money - (money/10));
                money = money / 10;
                curName = parent.get(curName);
            }
        }
        
        int[] answer = new int[enroll.length];
        for (int i=0; i<enroll.length; i++){
            answer[i] = total.getOrDefault(enroll[i], 0);
        }
        return answer;
    }
}