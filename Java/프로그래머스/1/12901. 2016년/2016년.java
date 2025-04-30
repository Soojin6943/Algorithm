class Solution {
    public String solution(int a, int b) {
        // 각 달 별 일 수
        int[] mon = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 입력 날짜 더할 변수
        int sum = 0;
        // 입력 날짜 총 일 수 
        for (int i=0; i<a-1; i++){
            sum += mon[i];
        }
        sum = sum + b;
        
        // 요일 구하기
        int day = sum % 7;
        
        if (day == 1){
            return "FRI";
        } else if (day == 2){
            return "SAT";
        } else if (day==3){
            return "SUN";
        } else if (day==4){
            return "MON";
        } else if (day==5){
            return "TUE";
        } else if (day==6){
            return "WED";
        } else {
            return "THU";
        }
        
    }
}