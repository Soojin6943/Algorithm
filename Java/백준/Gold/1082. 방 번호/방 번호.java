import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] price = new int[N];

        for (int i = 0; i < N; i++) {
            price[i] = sc.nextInt();
        }

        int M = sc.nextInt();

        // 0. 첫 자리 찾기
        int firstDigit = -1;
        int firstPrice = Integer.MAX_VALUE;

        for (int i=1; i<N; i++) {
            if (price[i] <= M && price[i] < firstPrice) {
                firstDigit = i;
                firstPrice = price[i];
            }
        }

        // 첫자리 못사면 답은 0
        if (firstDigit == -1) {
            System.out.println(0);
            return;
        }

        // 1. 가장 싼 숫자 찾기 + 가장 싼 금액
        int minPrice = price[0];
        int minDigit = 0;

        for (int i = 1; i < N; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
                minDigit = i;
            }
        }

        // 첫자리 구매
        StringBuilder sb = new StringBuilder();
        sb.append(firstDigit);
        int money = M - firstPrice;

        // 나머지 자리 채우기
        while (money >= minPrice) {
            sb.append(minDigit);
            money -= minPrice;
        }

        // 4. 앞자리부터 업그레이드
        for (int i = 0; i < sb.length(); i++) {
            int cur = sb.charAt(i) - '0';
            for (int d = N - 1; d >= cur; d--) {

                int diff = price[d] - price[cur];
                if (money >= diff) {
                    sb.setCharAt(i, (char) (d + '0'));
                    money -= diff;
                    break;
                }
            }
        }

        // 5. 출력
        System.out.println(sb);
    }
}