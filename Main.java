package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create Team
        Team team = new Team("The Warriors");

        // Create Players and add them to the team
        ArrayList<Player> playerList = new ArrayList<>(Arrays.asList(
            new Player("John Doe", "Forward"),
            new Player("Jason William", "Goalkeeper")
        ));

        for (Player player : playerList) {
            team.addPlayer(player);  // Add each player to the team
        }

        // Update Player Stats
        playerList.get(0).updateStats(20);
        playerList.get(1).updateStats(5);

        // Display each player's information
        for (Player player : playerList) {
            System.out.println(player.displayInfo());
        }

        // Display Team Information
        team.displayTeamInfo();
    }
}
