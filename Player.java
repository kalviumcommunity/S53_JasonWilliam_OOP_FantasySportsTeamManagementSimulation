package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

public class Player {
    private String name;
    private String position;
    private int stats;
    private static int totalPlayers = 0; // Static variable to track total players

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
        this.stats = 0;
        totalPlayers++; // Increment when a player is created
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void updateStats(int points) {
        stats += points;
    }

    public String displayInfo() {
        return "Player: " + name + ", Position: " + position + ", Stats: " + stats;
    }

    // Static method to get total number of players
    public static int getTotalPlayers() {
        return totalPlayers;
    }
}
