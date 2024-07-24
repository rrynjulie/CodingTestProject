package Programmers.FIbonacci;

class Solution {
    public int solution(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 0;
        answer[1] = 1;

        for (int i = 2; i <= n; i++) {
            answer[i] = (answer[i-1] + answer[i-2])  % 1234567;
        }

        return answer[n];
    }

    class Solution2 {
        public int solution(int n) {
            return fibo(0, 1, 2, n);
        }
        public int fibo(int previous, int current, int index, int N){
            if(index == N) return (previous + current) % 1234567;
            return fibo(current, (previous + current) % 1234567, index + 1, N);
        }
    }
}
