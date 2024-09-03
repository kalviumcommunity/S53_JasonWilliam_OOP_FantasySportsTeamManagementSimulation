package S53_JasonWilliam_OOP_FantasySportsTeamManagementSimulation;

public class Main {
    public static void main(String[] args) {
        // Create Team
        Team team = new Team("The Warriors");

        // Create Players
        Player player1 = new Player("John Doe", "Forward");
        Player player2 = new Player("Jason William", "Goalkeeper");

        // Add Players to the Team
        team.addPlayer(player1);
        team.addPlayer(player2);

        // Update player stats
        player1.updateStats(20);
        player2.updateStats(5);

        // Display Team Information
        team.displayTeamInfo();
    }
}

