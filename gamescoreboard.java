import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Player {
    private String name;
    private int score;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // Update score
    public void updateScore(int points) {
        score += points;
    }

    // Get player name
    public String getName() {
        return name;
    }

    // Get player score
    public int getScore() {
        return score;
    }

    // Reset score
    public void resetScore() {
        score = 0;
    }
}

class Scoreboard {
    private ArrayList<Player> players;

    // Constructor
    public Scoreboard() {
        players = new ArrayList<>();
    }

    // Add player
    public void addPlayer(String name) {
        players.add(new Player(name));
        System.out.println(name + " added successfully.");
    }

    // Update player score
    public void updatePlayerScore(String name, int points) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                player.updateScore(points);
                System.out.println("Score updated for " + name);
                return;
            }
        }
        System.out.println("Player not found!");
    }

    // Display leaderboard
    public void displayLeaderboard() {
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return p2.getScore() - p1.getScore();
            }
        });

        System.out.println("\n===== LEADERBOARD =====");
        int rank = 1;

        for (Player player : players) {
            System.out.println(rank + ". " +
                    player.getName() +
                    " - Score: " +
                    player.getScore());
            rank++;
        }
    }

    // Reset all scores
    public void resetScoreboard() {
        for (Player player : players) {
            player.resetScore();
        }
        System.out.println("\nAll scores have been reset.");
    }
}

public class Main {
    public static void main(String[] args) {

        Scoreboard scoreboard = new Scoreboard();

        // Add players
        scoreboard.addPlayer("Ankush");
        scoreboard.addPlayer("Rahul");
        scoreboard.addPlayer("Priya");

        // Update scores
        scoreboard.updatePlayerScore("Ankush", 50);
        scoreboard.updatePlayerScore("Rahul", 80);
        scoreboard.updatePlayerScore("Priya", 65);
        scoreboard.updatePlayerScore("Ankush", 20);

        // Display leaderboard
        scoreboard.displayLeaderboard();

        // Reset scores
        scoreboard.resetScoreboard();

        // Display leaderboard after reset
        scoreboard.displayLeaderboard();
    }
}