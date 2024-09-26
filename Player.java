package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

public class Player {
    private String name;
    private String position;
    private int stats;  // Player's performance stats

    // Constructor
    public Player(String name, String position) {
        this.name = name;
        this.position = position;
        this.stats = 0;  // Initialize stats to 0
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for position
    public String getPosition() {
        return position;
    }

    // Method to update player stats
    public void updateStats(int points) {
        stats += points;
    }

    // Method to display player information
    public String displayInfo() {
        return "Player: " + name + ", Position: " + position + ", Stats: " + stats;
    }
}
