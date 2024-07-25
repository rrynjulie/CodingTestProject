package Programmers;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int P = p.length();
        long pLong = Long.parseLong(p);

        for (int i = 0; i < t.length() - P + 1; i++) {
            long diff = Long.parseLong(t.substring(i, i + P));
            if (diff <= pLong) answer++;
        }

        return answer;
    }
}
