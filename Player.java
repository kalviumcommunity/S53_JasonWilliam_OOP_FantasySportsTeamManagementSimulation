package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;
import java.util.ArrayList;

// Abstract Class PlayerBase
abstract class PlayerBase {
    private String name;
    private String position;
    private int stats;

    public PlayerBase(String name, String position) {
        this.name = name;
        this.position = position;
        this.stats = 0;
    }

    // Abstract method to calculate performance rating (to be implemented by subclasses)
    public abstract int calculatePerformance();

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStats() {
        return stats;
    }

    public void updateStats(int points) {
        stats += points;
    }

    // Display player info
    public String displayInfo() {
        return "Player: " + name + ", Position: " + position + ", Stats: " + stats;
    }
}

// Concrete Class Player extending PlayerBase
public class Player extends PlayerBase {
    private static int totalPlayers = 0;

    public Player(String name, String position) {
        super(name, position);
        totalPlayers++;
    }

    // Implement the abstract method
    @Override
    public int calculatePerformance() {
        // Example calculation: Performance = Stats * 10
        return getStats() * 10;
    }

    // Static method to get total players
    public static int getTotalPlayers() {
        return totalPlayers;
    }
}


