class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i=0; i<nums.length-2; i++){
            for (int j=i+1; j<nums.length-1; j++){
                for (int k=j+1; k<nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    int prime = 0;
                    for (int m=2; m<=Math.sqrt(sum); m++){
                        if (sum % m == 0) {
                            prime = 1;
                            break;
                        }
                    }
                    if (prime == 0) answer += 1;
                }
            }
        }
        return answer;
    }
}