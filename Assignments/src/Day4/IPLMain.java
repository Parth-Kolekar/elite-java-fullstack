package Day4;

import java.util.ArrayList;
import java.util.List;

public class IPLMain {

    public static void main(String[] args) {

        // Polymorphism
        Team csk = new IPLTeam("Chennai Super Kings");
        Team mi = new IPLTeam("Mumbai Indians");
        Team rcb = new IPLTeam("Royal Challengers Bangalore");

        // Add players anywhere from main
        csk.addPlayer(new Player("MS Dhoni", 12));
        csk.addPlayer(new Player("Ruturaj Gaikwad", 18));

        mi.addPlayer(new Player("Rohit Sharma", 16));
        mi.addPlayer(new Player("Jasprit Bumrah", 18));

        rcb.addPlayer(new Player("Virat Kohli", 21));
        rcb.addPlayer(new Player("Rajat Patidar", 11));
        
        Team gt = new IPLTeam("Gujarat Titans");
        gt.addPlayer(new Player("Shubman Gill", 18));
        gt.addPlayer(new Player("Rashid Khan", 15));

        List<Team> teams = new ArrayList<>();

        teams.add(csk);
        teams.add(mi);
        teams.add(gt);
        teams.add(rcb);

        for (Team team : teams) {
            team.displayDetails();
        }
    }
}