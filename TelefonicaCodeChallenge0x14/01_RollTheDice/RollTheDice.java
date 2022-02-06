package com.mycompany.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RollTheDice {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            br.readLine();
            int[] dice = new int[2];
            int games = 1;

            while (br.ready()) {
                String line = br.readLine();

                dice[0] = Integer.parseInt(line.split(":")[0]);
                dice[1] = Integer.parseInt(line.split(":")[1]);

                String value = dice[0] + dice[1] != 12 ? String.valueOf(dice[0] + dice[1] + 1) : "-";

                System.out.println(String.format("Case #%d: %s", games, value));
                games += 1;
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
