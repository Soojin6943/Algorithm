import java.util.*;

class Solution {
    class file {
        String head;
        int number;
        int idx;
        String origin;
        
        file(String head, int number, int idx, String origin) {
            this.head = head;
            this.number = number;
            this.idx = idx;
            this.origin = origin;
        }
    }
    
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        
        List<file> list = new ArrayList<>();
        
        for (int i=0; i<files.length; i++) {
            String file = files[i];
            
            int index = 0;
            while (index < file.length() && !Character.isDigit(file.charAt(index))) {
                index++;
            }
            int headEnd = index;
            
            while (index < file.length() && Character.isDigit(file.charAt(index))) {
                index++;
            }
            int numberEnd = index;
            
            String head = file.substring(0, headEnd).toLowerCase();
            int number = Integer.parseInt(file.substring(headEnd, numberEnd));
            list.add(new file(head, number, i, file));
        }
        
        Collections.sort(list, (f1, f2) -> {
            if (!f1.head.equals(f2.head)) return f1.head.compareTo(f2.head);
            else if (f1.number != f2.number) return f1.number - f2.number;
            else return f1.idx - f2.idx;
        });
        
        for (int i=0; i<files.length; i++) {
            answer[i] = list.get(i).origin;
        }
        
        
        return answer;
    }
}