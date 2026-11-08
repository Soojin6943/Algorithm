class Solution {
    public int[] solution(int brown, int yellow) {
        int[] result = new int[2];
        for (int i=yellow-1; i>0; i--) {
            if (yellow % i == 0) {
                int row = i;
                int col = yellow / i;
                
                if (row * 2 + yellow * 2 + 4 == brown) {
                    result[1] = row + 2;;
                    result[0] = col + 2;
                    break;
                }
            }
            continue;
        }
        return result;
    }
}