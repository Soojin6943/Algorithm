import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        // 1. ext 값이 val_ext보다 작은 데이터 추출
        // 2. 추출한 데이터 sort_by로 정렬
        
        int e = map.get(ext);
        int s = map.get(sort_by);
        
        for (int[] ex : data){
            if (ex[e] < val_ext) {
                answer.add(ex);
            }
        }
        
        // sort
        answer.sort(Comparator.comparingInt(a -> a[s]));
        
        int[][] result = new int[answer.size()][4];
        for (int i=0; i<answer.size(); i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}