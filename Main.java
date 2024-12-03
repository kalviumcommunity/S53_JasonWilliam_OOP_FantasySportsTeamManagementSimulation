package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create two Teams using dynamic memory allocation (new keyword)
        Team team1 = new Team("The Warriors");
        Team team2 = new Team("The Kings");

        // Create Players dynamically using the new keyword and add them to teams
        PlayerBase player1 = new Striker("John Doe");
        PlayerBase player2 = new Goalkeeper("Jason William");
        PlayerBase player3 = new Striker("David Smith");
        PlayerBase player4 = new Goalkeeper("Michael Johnson");

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

        // Display total number of teams
        System.out.println("\nTotal number of teams: " + Team.getTotalTeams());
    }
}
