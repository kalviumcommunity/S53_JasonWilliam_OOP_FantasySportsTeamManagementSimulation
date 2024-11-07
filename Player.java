package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

public class Player {
    private String name;
    private String position;
    private int stats;
    private static int totalPlayers = 0; // Static variable to track total players

    // Constructor
    public Player(String name, String position) {
        this.name = name;
        this.position = position;
        this.stats = 0;
        totalPlayers++; // Increment when a player is created
    }


    // Getter for 'name' (Accessor)
    public String getName() {
        return name;
    }

    // Setter for 'name' (Mutator)
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'position' (Accessor)
    public String getPosition() {
        return position;
    }

    // Setter for 'position' (Mutator)
    public void setPosition(String position) {
        this.position = position;
    }

    // Getter for 'stats' (Accessor)
    public int getStats() {
        return stats;
    }

    // Setter for 'stats' (Mutator)
    public void setStats(int stats) {
        this.stats = stats;
    }

    // Method to update stats
    public void updateStats(int points) {
        stats += points;
    }

    // Method to display player info
    public String displayInfo() {
        return "Player: " + name + ", Position: " + position + ", Stats: " + stats;
    }

    // Static method to get total number of players
    public static int getTotalPlayers() {
        return totalPlayers;
    }
}
