class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int tmp;
        for (int i=0; i < num_list.length-1; i++){
            for (int k=0; k<num_list.length-i-1; k++){
                if (num_list[k] > num_list [k+1]){
                    tmp = num_list[k];
                    num_list[k] = num_list[k+1];
                    num_list[k+1] = tmp;
                }
            }
        }
        for (int i=0; i<5; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}