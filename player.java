public class Player {
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