class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
//         if(bill[0]<bill[1]){
//             int tmp = bill[0];
//             bill[0] = bill[1];
//             bill[1] = tmp;
//         }
        
//         // bill[0]이 큰 길이로 설정
//         while(!(bill[0] < wallet[0] && bill[1] < wallet[1])){
//             if (bill[0] > wallet[0] || bill[1] > wallet[1]) {
//                 bill[0] = bill[0] / 2;
//                 answer ++;
//             }
//             if(bill[0]<bill[1]){
//                 int tmp = bill[0];
//                 bill[0] = bill[1];
//                 bill[1] = tmp;
//             }
//         }
        
        while (true) {
            if((bill[0]<=wallet[0] && bill[1]<=wallet[1]) || (bill[0]<=wallet[1] && bill[1]<=wallet[0])){
                break;
            }
            if(bill[0] > bill[1]){
                bill[0] = bill[0] / 2;
                answer ++;
            } else {
                bill[1] = bill[1] / 2;
                answer ++;
            }
        }
        
        return answer;
    }
}