import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int m_cnt = 0;
        int now = 0;
        int result = 0;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if (c != '+' && c != '-'){
                now = now * 10 + (c - '0');
            } else {
                if (m_cnt == 0){
                    result += now;
                    now = 0;
                } else {
                    result -= now;
                    now = 0;
                }
                if (c == '-'){
                    m_cnt = 1;
                }
            }
        }

        if (m_cnt == 0){
            result += now;
        } else {
            result -= now;
        }

        System.out.println(result);

    }
}
