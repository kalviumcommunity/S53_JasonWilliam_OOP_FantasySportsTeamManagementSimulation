package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;
import java.util.ArrayList;

public class Team {
    // Attributes
    private String teamName;
    private ArrayList<Player> players;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    // Method to add a player to the team
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Method to display team information
    public void displayTeamInfo() {
        System.out.println("Team: " + teamName);
        for (Player player : players) {
            System.out.println(player.displayInfo());
        }
    }
}

