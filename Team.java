package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private static int totalTeams = 0; // Static variable to track total teams

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
        totalTeams++; // Increment when a new team is created
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.getName() + " has been added to " + this.teamName);
    }

    public void removePlayer(Player player) {
        if (players.remove(player)) {
            System.out.println(player.getName() + " has been removed from " + this.teamName);
        } else {
            System.out.println("Player not found in " + this.teamName);
        }
    }

    public void displayTeamInfo() {
        System.out.println("Team: " + teamName);
        System.out.println("Players:");
        for (Player player : players) {
            System.out.println("- " + player.getName() + " (" + player.getPosition() + ")");
        }
        // System.out.println("Total players: " + Player.getTotalPlayers());
    }

    // Static method to get total number of teams
    public static int getTotalTeams() {
        return totalTeams;
    }
}
