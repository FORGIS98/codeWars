package com.mycompany.app;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class PassagePathing {
    public static void main(String[] args) {
        List<String> lines = readAllLines(args[0]);
        Graph graph = new Graph();

        for (String line : lines) {
            String[] newNodes = line.split("-");
            graph.addNodePair(newNodes[0], newNodes[1]);
        }

        System.out.println(String.format("First star: %d", graph.getAllPaths()));
    }

    public static List<String> readAllLines(String fileName) {
        List<String> lines = Collections.emptyList();

        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
