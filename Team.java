package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>(); // Initialize the players list
    }

    // Method to add a player to the team
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Method to remove a player from the team
    public void removePlayer(Player player) {
        if (players.contains(player)) {
            players.remove(player);
            System.out.println(player.getName() + " has been removed from the team.");
        } else {
            System.out.println(player.getName() + " is not on the team.");
        }
    }

    // Method to display the team info
    public void displayTeamInfo() {
        System.out.println("Team: " + teamName);
        System.out.println("Players in the team:");
        for (Player player : players) {
            System.out.println(player.getName() + " - " + player.getPosition());
        }
    }
}
