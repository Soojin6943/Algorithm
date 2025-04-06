class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();
        
        // -1 해주면 빈 값도 배열에 받을 수 있음
        String[] arr = s.split(" ", -1);

        for (int i=0; i<arr.length; i++){
            String a = arr[i];
            System.out.println(a);
            
            // 공백 여러개 이어질 경우 처리하기!!!
            if (a.length() == 0){
                answer.append("");
            } else if(a.charAt(0) < 57 && a.charAt(0) > 48 ){
                answer.append(a.charAt(0));
                answer.append(a.substring(1, a.length()).toLowerCase());

            } else {
                answer.append(Character.toUpperCase(a.charAt(0)));
                answer.append(a.substring(1, a.length()).toLowerCase());

            }
            
            if (i != arr.length -1){
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}