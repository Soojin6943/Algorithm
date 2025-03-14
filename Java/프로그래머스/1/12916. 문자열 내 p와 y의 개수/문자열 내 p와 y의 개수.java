class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cnt_p = 0;
        int cnt_y = 0;
        
        String[] arr = s.split("");
        for (int i=0; i<arr.length; i++){
            if (arr[i].equals("P") || arr[i].equals("p")){
                cnt_p += 1;
            } else if (arr[i].equals("y") || arr[i].equals("Y")) {
                cnt_y += 1;
            }
        }
        System.out.println(cnt_p + " " + cnt_y);
        
        if (cnt_y == cnt_p || (cnt_y==0 && cnt_p==0)){
            answer = true;
        } else{
            answer = false;
        }
        return answer;
    }
}