import java.util.Arrays;

public class Solution {
    public int[] solution(int []arr) {
        int[] temp = new int[arr.length];
        int size = 0;
        
        for (int n : arr) {
            if (size == 0 || temp[size - 1] != n) {
                temp[size++] = n;
            }
        }
        
        return Arrays.copyOf(temp, size);
    }
}