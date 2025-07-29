class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i=0; i<babbling.length; i++){
            
            // 연속되는 발음이 나오면 넘어가기
            if (babbling[i].contains("ayaaya")||babbling[i].contains("yeye")||babbling[i].contains("woowoo")||babbling[i].contains("mama"))
                continue;
            
            // 가능한 발음은 공백으로 변환 -> 모두 공백이 되면 가능한 발음
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");

            
            if (babbling[i].length()==0)
                answer+=1;
        }
        return answer;
    }
}