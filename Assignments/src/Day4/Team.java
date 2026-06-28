package Day4;
import java.util.ArrayList;
import java.util.List;

public class Team {

    protected String teamName;
    protected List<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void displayDetails() {
        System.out.println("\nTeam : " + teamName);

        for (Player p : players) {
            System.out.println("Player : " + p);
        }
    }
}