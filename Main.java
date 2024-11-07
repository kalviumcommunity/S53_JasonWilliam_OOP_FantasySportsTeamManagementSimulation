package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

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

        // Display each player's information using encapsulated getter methods
        System.out.println(player1.displayInfo()); // Display player1 info
        System.out.println(player2.displayInfo()); // Display player2 info
        System.out.println(player3.displayInfo()); // Display player3 info
        System.out.println(player4.displayInfo()); // Display player4 info

        // Demonstrate usage of setters by updating player details
        player1.setName("Johnny Bravo");
        player1.setPosition("Striker");
        System.out.println("\nAfter updating player1's details:");
        System.out.println(player1.displayInfo()); // Display updated player1 info

        // Display Team Information before removing a player
        System.out.println("\nBefore removing a player from The Warriors:");
        team1.displayTeamInfo();  // Display info for team1

        System.out.println("\nBefore removing a player from The Kings:");
        team2.displayTeamInfo();  // Display info for team2

        // Remove one player from each team
        team1.removePlayer(player1);  // Remove player1 from team1
        team2.removePlayer(player2);  // Remove player2 from team2

        // Display Team Information after removing players
        System.out.println("\nAfter removing a player from The Warriors:");
        team1.displayTeamInfo();  // Display team1 info after removal

        System.out.println("\nAfter removing a player from The Kings:");
        team2.displayTeamInfo();  // Display team2 info after removal

        // Display total number of teams using static method
        System.out.println("\nTotal number of teams: " + Team.getTotalTeams());

        // Display total number of players using static method
        System.out.println("Total number of players: " + Player.getTotalPlayers());
    }
}
