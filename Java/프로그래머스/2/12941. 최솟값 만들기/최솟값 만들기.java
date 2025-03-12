import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        // 1. sort 정렬
        // 2. 큰수랑 작은수 곱
        // 3. 더하기
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        // System.out.print(A[1]); sort 테스트
        
        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[A.length-i-1];
        }

        return answer;
    }
}