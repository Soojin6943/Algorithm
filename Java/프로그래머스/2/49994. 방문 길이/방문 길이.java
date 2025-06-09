import java.util.*;
class Solution {
    public int solution(String dirs) {
        
        int answer = 0;
        HashSet<String> set = new HashSet<>();
    
        int nowX = 5;
        int nowY = 5;
    
        for (char c : dirs.toCharArray()) {
            if (c == 'U' && nowY < 10) {
                set.add(nowX + " " + nowY + " " + nowX + " " + (nowY+1));
                set.add(nowX + " " + (nowY+1) + " " + nowX + " " + nowY);
                nowY += 1;
            } else if (c == 'D' && nowY > 0){
                set.add(nowX + " " + nowY + " " + nowX + " " + (nowY-1));
                set.add(nowX + " " + (nowY-1) + " " + nowX + " " + nowY);
                nowY -= 1;
            } else if (c == 'R' && nowX < 10) {
                set.add((nowX+1) + " " + nowY + " " + nowX + " " + nowY);
                set.add(nowX + " " + nowY + " " + (nowX+1) + " " + nowY);
                nowX += 1;
            } else if (c == 'L' && nowX > 0) {
                set.add((nowX-1) + " " + nowY + " " + nowX + " " + nowY);
                set.add(nowX + " " + nowY + " " + (nowX-1) + " " + nowY);
                nowX -= 1;
            } else{
                continue;
            }
        }
    
        answer = set.size() / 2;
        return answer;
    }
}