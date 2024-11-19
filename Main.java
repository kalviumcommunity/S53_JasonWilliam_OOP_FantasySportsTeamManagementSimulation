package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create two Teams using dynamic memory allocation (new keyword)
        Team team1 = new Team("The Warriors");
        Team team2 = new Team("The Kings");

        // Create Players dynamically using the new keyword and add them to teams
        Player player1 = new Player("John Doe", "Forward");
        Player player2 = new Player("Jason William", "Goalkeeper");
        Player player3 = new Player("David Smith", "Midfielder");
        Player player4 = new Player("Michael Johnson", "Defender");

        // Add two players to the first team
        team1.addPlayer(player1);
        team1.addPlayer(player3);

        // Add two players to the second team
        team2.addPlayer(player2);
        team2.addPlayer(player4);

        // Update Player Stats using encapsulated methods
        player1.updateStats(20);  // Update stats for player1
        player2.updateStats(5);   // Update stats for player2
        player3.updateStats(15);  // Update stats for player3
        player4.updateStats(10);  // Update stats for player4

        // Display Team Information
        System.out.println("\nTeam Information:");
        team1.displayTeamInfo();
        team2.displayTeamInfo();

        // Display total number of teams and players
        System.out.println("\nTotal number of teams: " + Team.getTotalTeams());
        System.out.println("Total number of players: " + Player.getTotalPlayers());
    }
}
