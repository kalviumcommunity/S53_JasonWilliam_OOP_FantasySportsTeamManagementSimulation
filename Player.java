package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

public class Player {
    // Attributes
    private String name;
    private String position;
    private int performanceStats;

    // Constructor
    public Player(String name, String position) {
        this.name = name;
        this.position = position;
        this.performanceStats = 0;
    }

    // Method to update performance statistics
    public void updateStats(int points) {
        this.performanceStats += points;
    }

    // Method to display player information
    public String displayInfo() {
        return "Player: " + name + ", Position: " + position + ", Performance Stats: " + performanceStats;
    }
}

