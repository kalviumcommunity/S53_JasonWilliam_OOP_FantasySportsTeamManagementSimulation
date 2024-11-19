package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

import java.util.ArrayList;

class Team {
    private String teamName;
    private ArrayList<PlayerBase> players;
    private static int totalTeams = 0;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
        totalTeams++;
    }

    public void addPlayer(PlayerBase player) {
        players.add(player);
        System.out.println(player.getName() + " has been added to " + this.teamName);
    }

    public void removePlayer(PlayerBase player) {
        if (players.remove(player)) {
            System.out.println(player.getName() + " has been removed from " + this.teamName);
        } else {
            System.out.println("Player not found in " + this.teamName);
        }
    }

    public void displayTeamInfo() {
        System.out.println("Team: " + teamName);
        System.out.println("Players:");
        for (PlayerBase player : players) {
            System.out.println("- " + player.getName() + " (" + player.getPosition() + ")");
            System.out.println("  Performance Rating: " + player.calculatePerformance());
        }
    }

    // Static method to get total teams
    public static int getTotalTeams() {
        return totalTeams;
    }
}

