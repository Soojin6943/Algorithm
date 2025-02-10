import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        // 중복값 제거를 위한 해시셋 생성 
        HashSet<Integer> set = new HashSet<>();
        
        // 두 수를 선택하는 모든 경우의 수
        for (int i=0; i< numbers.length - 1; i++) {
            for (int j = i + 1; j< numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}