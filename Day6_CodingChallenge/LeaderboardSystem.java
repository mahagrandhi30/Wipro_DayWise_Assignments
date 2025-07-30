package collections.intro;

import java.util.*;

public class LeaderboardSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> playerScores = new HashMap<>();

        System.out.print("Enter number of players: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter player name: ");
            String name = scanner.nextLine();
            System.out.print("Enter score for " + name + ": ");
            int score = scanner.nextInt();
            scanner.nextLine(); // consume newline
            playerScores.put(name, score);
        }

        // Convert to list and sort by score descending
        List<Map.Entry<String, Integer>> leaderboard = new ArrayList<>(playerScores.entrySet());

        leaderboard.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\n🏆 Leaderboard (Highest to Lowest Score):");
        int rank = 1;
        for (Map.Entry<String, Integer> entry : leaderboard) {
            System.out.println(rank + ". " + entry.getKey() + " - " + entry.getValue());
            rank++;
        }

        // Search for a player's rank
        System.out.print("\nEnter player name to find their rank: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        rank = 1;
        for (Map.Entry<String, Integer> entry : leaderboard) {
            if (entry.getKey().equalsIgnoreCase(searchName)) {
                System.out.println(searchName + " is ranked #" + rank + " with score: " + entry.getValue());
                found = true;
                break;
            }
            rank++;
        }

        if (!found) {
            System.out.println("Player not found in the leaderboard.");
        }

        scanner.close();
    }
}
