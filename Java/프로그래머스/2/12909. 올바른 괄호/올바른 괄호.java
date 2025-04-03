class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // 1. ( 괄호는 카운트 1 증가
        // 2. ) 괄호는 카운트 1 다운
        // 3. 카운트 0 인데 ) 들어오면 실패
        // 4. 마지막에 카운트 0이면 성공
        int cnt = 0;
        
        for (char test : s.toCharArray()){
            if (test == '('){
                cnt ++;
            } else {
                if (cnt == 0){
                    return false;
                } else {
                    cnt --;
                }
            }
        }
        
        if (cnt != 0){
            return false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        return answer;
    }
}