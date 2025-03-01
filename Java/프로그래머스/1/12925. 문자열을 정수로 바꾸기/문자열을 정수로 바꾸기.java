class Solution {
    public int solution(String s) {
        int answer = 0;
        
//         if (s.charAt(1) == '+') {
//             System.out.print('+');
//             s = s.substring(1, s.length()+1);
//             answer = Integer.parseInt(s); 

//         } else if (s.charAt(1) == '-') {
//             System.out.print('-');
//             s = s.substring(1, s.length()+1);
//             answer = Integer.parseInt(s);

//         } else {
//             answer = Integer.parseInt(s);
//         }
        answer = Integer.parseInt(s);
        System.out.print(answer);
        return answer;
    }
}