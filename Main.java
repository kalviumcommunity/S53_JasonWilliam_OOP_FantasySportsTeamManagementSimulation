package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

public class Main {
    public static void main(String[] args) {
        // Create Team using new keyword
        Team team = new Team("The Warriors");

        // Create Players using new keyword and add them to the team
        Player player1 = new Player("John Doe", "Forward");
        Player player2 = new Player("Jason William", "Goalkeeper");

        // Add players to the team
        team.addPlayer(player1);  // Add first player to the team
        team.addPlayer(player2);  // Add second player to the team

        // Update Player Stats
        player1.updateStats(20);
        player2.updateStats(5);

        // Display each player's information
        System.out.println(player1.displayInfo());
        System.out.println(player2.displayInfo());

        // Display Team Information
        team.displayTeamInfo();
        
        // Optionally remove a player and demonstrate freeing up resources
        team.removePlayer(player1);  // Assuming you have a method to remove players
        System.out.println("After removing a player:");
        team.displayTeamInfo();
    }
}
