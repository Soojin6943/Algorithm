class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        StringBuilder st = new StringBuilder(my_string);
        char c = my_string.charAt(num1);
        
        st.setCharAt(num1, my_string.charAt(num2));
        st.setCharAt(num2, c);
        
        String answer = st.toString();
        return answer;
    }
}