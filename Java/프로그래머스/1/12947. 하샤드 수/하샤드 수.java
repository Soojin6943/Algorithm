class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        // 1. x를 정수로 변경
        String hsd = x + "";
        // 2. 정수를 각 자리별로 받은 후 정수로 바꿔서 더하기
        String[] arr = hsd.split("");
        for (String a : arr){
            sum += Integer.parseInt(a);
        }
        // 3. 히샤드 수인지 판별
        if (x % sum != 0){
            answer = false;
        }
        return answer;
    }
}