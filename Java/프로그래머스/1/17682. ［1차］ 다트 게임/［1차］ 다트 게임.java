class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        int[] arr = new int[3];
        int i=0;
        int idx = 0;
        int next = 0;
        char bonus;
        while(idx<3){
            
            int score = dartResult.charAt(i) - '0';
            if (dartResult.charAt(i+1) == '0'){
                score = 10;
                bonus = dartResult.charAt(i+2);
                next = i+3;
            } else {
                bonus = dartResult.charAt(i+1);
                next = i+2;
            }
            
            if(bonus == 'S') {
                arr[idx] = score * 1;
            } else if (bonus == 'D') {
                arr[idx] = score * score;
            } else if (bonus == 'T') {
                arr[idx] = score * score * score;
            }
            
            if (next >= dartResult.length()){
                break;
            }
            char option = dartResult.charAt(next);
            if (option != '#' && option != '*'){
                i = next;
                idx ++;
                continue;
            } else if (option == '*'){
                if (idx == 0){
                    arr[0] *= 2;
                } else{
                    arr[idx] *= 2;
                    arr[idx-1] *= 2;
                }
            } else if (option == '#'){
                arr[idx] *= -1;
            }
            i = next + 1;
            idx ++;
        }
        
        for (int a : arr){
            System.out.println(a);
            answer += a;
        }
        return answer;
    }
}