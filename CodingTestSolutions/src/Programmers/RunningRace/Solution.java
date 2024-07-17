package Programmers.RunningRace;

import java.util.*;

class Solution {
    public String[] solution (String[]players, String[]callings){
        Map<String, Integer> playersMap = new HashMap<>();

        for (int i = 0; i < players.length; i++)
            playersMap.put(players[i], i);

        for (String calling : callings) {
            int ranking = playersMap.get(calling);

            playersMap.put(players[ranking - 1], ranking);
            playersMap.put(players[ranking], ranking - 1);

            String temp = players[ranking - 1];
            players[ranking - 1] = players[ranking];
            players[ranking] = temp;
        }
        return players;
    }

        public static void main(String[] args) {
            Solution solution = new Solution();

            String[] players = {"mumu", "soe", "poe", "kai", "mine"};
            String[] callings = {"kai", "kai", "mine", "mine"};

            String[] result = solution.solution(players, callings);

            // 결과 출력
            System.out.println(Arrays.toString(result));
        }
}
