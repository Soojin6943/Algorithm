import java.util.*;

class Solution {
    static class Song {
        int index;
        int play;
        
        Song(int idx, int play) {
            this.index = idx;
            this.play = play;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        HashMap<String, Integer> totalGenres = new HashMap<>();
        HashMap<String, List<Song>> music = new HashMap<>();
        
        for (int i=0; i<genres.length; i++) {
            totalGenres.put(genres[i], totalGenres.getOrDefault(genres[i], 0) + plays[i]);
            
            music.computeIfAbsent(genres[i], k -> new ArrayList<>())
                .add(new Song(i, plays[i]));
        }
        
        // 장르 내림차순
        List<String> genresKey = new ArrayList<>(totalGenres.keySet());
        genresKey.sort((o1, o2) -> {
            return totalGenres.get(o2) - totalGenres.get(o1);
        });
        
        List<Integer> result = new ArrayList<>();
        
        for (String genre : genresKey) {
            List<Song> song = music.get(genre);
            
            song.sort((o1, o2) -> {
                if (o1.play == o2.play) return o1.index - o2.index;
                return o2.play - o1.play;
            });
            
            result.add(song.get(0).index);
            if (song.size() > 1) result.add(song.get(1).index);
        }
        
        answer = result.stream()
            .mapToInt(i -> i)
            .toArray();
        return answer;
    }
}