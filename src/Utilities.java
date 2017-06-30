import java.util.ArrayList;

/**
 * Created by MDS1728 on 6/1/2017.
 */
public class Utilities {
    //extends BaseballGame class

    //constructor

    //  determines outs and bases from random number

    public Utilities() {
//        doIt();
    }

    public String atBat() {
            int score = randomNumber(100);
            if (score <= 70)
                return "Out";
            else if (score >= 71 && score <= 87)
                return "Single";
            else if (score >= 88 && score <= 94)
                return "Double";
            else if (score >= 95 && score <= 96)
                return "Tripple";
            else
                return "Home Run";
        }

    //Generates random number
    public int randomNumber(int limit) {
        int score;
        score = ((int) (Math.random() * limit)) + 1;
        //Remove comment to show random number
//        System.out.println(score);
        return score;


        //Prints Array, Double Array or array list}
    }

    public void printTeam(Team theTeam ){
        theTeam.getPlayers();
        ArrayList<Player> thePlayers = theTeam.getPlayers();
        for (Player p : thePlayers) {
            System.out.print(p.getName() +", ");
        }
    }
}