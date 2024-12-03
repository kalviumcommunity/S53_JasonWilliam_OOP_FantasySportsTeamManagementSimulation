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

// Concrete Class Striker extending PlayerBase
class Striker extends PlayerBase {
    public Striker(String name) {
        super(name, "Striker");
    }

    @Override
    public int calculatePerformance() {
        // Strikers' performance is based more on goals scored
        return getStats() * 15;
    }
}

// Concrete Class Goalkeeper extending PlayerBase
class Goalkeeper extends PlayerBase {
    public Goalkeeper(String name) {
        super(name, "Goalkeeper");
    }

    @Override
    public int calculatePerformance() {
        // Goalkeepers' performance is based on saves made
        return getStats() * 20;
    }
}
