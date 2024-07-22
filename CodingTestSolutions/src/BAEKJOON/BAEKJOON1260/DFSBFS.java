package BAEKJOON.BAEKJOON1260;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class DFSBFS{

    private static int N;
    private static String dfsRoute = "";
    private static String bfsRoute = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");

        N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        int V = Integer.parseInt(firstLine[2]);

        int[][] nodes = new int[N+1][N+1];
        for(int i = 0; i < M; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            nodes[a][b] = nodes[b][a] = 1;
        }
        dfs(V, nodes, new boolean[N+1]);
        bfs(V, nodes, new boolean[N+1]);

        System.out.println(dfsRoute.trim());
        System.out.println(bfsRoute.trim());

        br.close();
    }

    public static void dfs(int currentNode, int[][] nodes, boolean[] checks){
        checks[currentNode] = true;
        dfsRoute += currentNode + " ";

        for(int i = 0; i <= N; i++) {
            if (nodes[currentNode][i] == 1 && !checks[i]) {
                dfs(i, nodes, checks);
            }
        }
    }
    public static void bfs(int currentNode, int[][] nodes, boolean[] checks){
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(currentNode);
        checks[currentNode] = true;

        while(!queue.isEmpty()){
            currentNode = queue.poll();
            bfsRoute += currentNode + " ";

            for(int i = 1; i <= N; i++){
                if(nodes[currentNode][i] == 1 && !checks[i]){
                    queue.add(i);
                    checks[i] = true;
                }
            }
        }
    }
}