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