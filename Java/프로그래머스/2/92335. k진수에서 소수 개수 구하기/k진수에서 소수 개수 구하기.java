import java.util.Stack;

class Solution {
    static String change(int n, int k){
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        
        while (n > 0){
            st.push(n % k);
            n /= k;
        }
        
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.toString();
    }
    public int solution(int n, int k) {
        int answer = 0;
        
        // 1. 진수 변환
        // 2. 0 기준으로 자르기
        // 3. (232 같은거 2, 3, 2, 23, 32, 232 이런식으로 봐야하는 확인)
        // n 백만
        
        // 진법 변환
        String str = change(n, k);
        // System.out.println(str);
        
        // 자르는거 다듬기
        String[] arr = str.split("0");
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        for (String s : arr){
            if (s.equals("")) continue;
            Long i = Long.parseLong(s);
            boolean is = true;
            if (i < 2) {
                is = false;
                continue;
            }
            for (int j=2; j<=Math.sqrt(i); j++){
            
                if (i % j == 0){
                    is = false;
                    break;
                }
            }
            if (is) answer++;
        }
        
        
        return answer;
    }
}