package com.interviewcake.solutions.p594;

import java.util.*;

public class MeshMessages {

    public static List<String> findShortestPath(
            Map<String, List<String>> network, String sender, String recipient) {

        if (sender.equals(recipient)) {
            return Collections.singletonList(sender); // same person
        }

        // Queue holds paths as lists of users
        Queue<List<String>> queue = new LinkedList<>();
        queue.add(new ArrayList<>(List.of(sender)));

        // Visited set to prevent cycles
        Set<String> visited = new HashSet<>();
        visited.add(sender);

        while (!queue.isEmpty()) {
            List<String> path = queue.poll();
            String lastUser = path.get(path.size() - 1);

            List<String> neighbors = network.getOrDefault(lastUser, Collections.emptyList());
            for (String neighbor : neighbors) {
                if (visited.contains(neighbor)) continue;

                // New path including this neighbor
                List<String> newPath = new ArrayList<>(path);
                newPath.add(neighbor);

                if (neighbor.equals(recipient)) {
                    return newPath; // Found shortest path
                }

                queue.add(newPath);
                visited.add(neighbor);
            }
        }

        // No path found
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        Map<String, List<String>> network = Map.of(
                "Min", List.of("William", "Jayden", "Omar"),
                "William", List.of("Min", "Noam"),
                "Jayden", List.of("Min", "Amelia", "Ren", "Noam"),
                "Ren", List.of("Jayden", "Omar"),
                "Amelia", List.of("Jayden", "Adam", "Miguel"),
                "Adam", List.of("Amelia", "Miguel", "Sofia", "Lucas"),
                "Miguel", List.of("Amelia", "Adam", "Liam", "Nathan"),
                "Noam", List.of("Nathan", "Jayden", "William"),
                "Omar", List.of("Ren", "Min", "Scott")
        );

        String sender = "Jayden";
        String recipient = "Adam";

        List<String> path = findShortestPath(network, sender, recipient);
        System.out.println(path); // Output: [Jayden, Amelia, Adam]
    }
}
