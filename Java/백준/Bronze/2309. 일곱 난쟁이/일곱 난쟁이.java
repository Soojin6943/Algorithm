import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 난쟁이 키 받기
        int[] height = new int[9];
        int sum = 0;
        
        for (int i=0; i<9; i++) {
            height[i] = sc.nextInt();
            sum += height[i];
        }
        
        // 난쟁이 키 정렬
        Arrays.sort(height);
        
        for (int i=0; i<8; i++) {
            for (int j=i+1; j<9; j++) {
                if (sum - height[i] - height[j] == 100) {
                    for (int k=0; k<9; k++) {
                        if (k == i || k == j) continue;
                        System.out.println(height[k]);
                    }
                    return;
                }
            }
        }
        
    }
}