class Solution {
    public int solution(String s) {
        
        String[] words = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i<=9; i++) {
            if (s.contains(words[i])) {
                s = s.replace(words[i], i + "");
            }
        }
        
        return Integer.parseInt(s);
        
        
    }
}