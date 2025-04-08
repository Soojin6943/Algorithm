class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        int x_max = board[0]/2;
        int x_min = (board[0]/2) * -1;
        
        int y_max = board[1]/2;
        int y_min = (board[1]/2) * -1;
        
        for (String key: keyinput){
            if (key.equals("up") && answer[1] < y_max) answer[1] += 1;
            else if (key.equals("down") && answer[1] > y_min) answer[1] -= 1;
            else if (key.equals("left") && answer[0] > x_min) answer[0] -= 1;
            else if (key.equals("right") && answer[0] < x_max) answer[0] += 1;
        }

        return answer;
    }
}