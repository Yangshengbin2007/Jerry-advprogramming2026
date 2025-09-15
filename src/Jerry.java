import java.util.Random;
import java.util.Scanner;

public class GamePlayer {

    private int score = 0;        
    private String playerName;    

    public GamePlayer(String name) {
        this.playerName = name;
    }

    public static String calculateLevel(int score) {
        if (score >= 100) {
            return "Master";
        } else if (score >= 50) {
            return "Advanced";
        } else {
            return "Beginner";
        }
    }
    public int addRandomPoints() {
        Random rand = new Random();
        int points = rand.nextInt(100) + 1; 
        score += points;
        System.out.println(playerName + " gained " + points + " points!");
        return score;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        GamePlayer player = new GamePlayer(name);

        int newScore = player.addRandomPoints();
        System.out.println("Total Score: " + newScore);

        String level = GamePlayer.calculateLevel(newScore);
        System.out.println("Player Level: " + level);

        input.close();
    }
}
