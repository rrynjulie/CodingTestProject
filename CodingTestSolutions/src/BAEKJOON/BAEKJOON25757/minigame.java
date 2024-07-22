package BAEKJOON.BAEKJOON25757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class minigame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");

        int N = Integer.parseInt(firstLine[0]);
        String gameName = firstLine[1];
        HashSet<String> players = new HashSet<>();

        while (N > 0){
            players.add(br.readLine());
            N--;
        }

        int p = 0;
        switch (gameName){
            case "Y": p = 1;
                break;
            case "F": p = 2;
                break;
            case "O": p = 3;
                break;
        }

        System.out.println(players.size() / p);

        br.close();
    }
}
