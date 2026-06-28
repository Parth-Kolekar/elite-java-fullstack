package Day4;

public class IPLTeam extends Team {

    public IPLTeam(String teamName) {
        super(teamName);
    }

    @Override
    public void displayDetails() {
        System.out.println("\n==============================");
        System.out.println("IPL TEAM DETAILS");
        System.out.println("==============================");

        super.displayDetails();
    }
}