package Day4;

public class Player {

    private String playerName;
    private double bidAmount;

    public Player(String playerName, double bidAmount) {
        this.playerName = playerName;
        this.bidAmount = bidAmount;
    }

    public String getPlayerName() {
        return playerName;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    @Override
    public String toString() {
        return playerName + " - ₹" + bidAmount + " Cr";
    }
}