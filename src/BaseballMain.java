import javax.rmi.CORBA.Util;
import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;

/**
 * Created by MDS1728 on 6/1/2017.
 */
public class BaseballMain {

    public static void main(String[] args) {
        Utilities myUtil = new Utilities();
        String atBatResult = myUtil.atBat();
        // need to get batter from list and print out should read "Batter" - result
        System.out.println("This batter's result - "+atBatResult);


     Team homeTeam = new Team("Home Depot");
     Team visitingTeam = new Team("Marvels");



     homeTeam.addPlayer(new Player("Phillip"));
     homeTeam.addPlayer(new Player("Charles"));
     homeTeam.addPlayer(new Player("Issac"));
     homeTeam.addPlayer(new Player("Danny"));
     homeTeam.addPlayer(new Player("Mark"));
     homeTeam.addPlayer(new Player("Glenn"));
     homeTeam.addPlayer(new Player("Nathan"));
     homeTeam.addPlayer(new Player("Juanita"));
     homeTeam.addPlayer(new Player("Dan"));

        myUtil.printTeam(homeTeam);
      //  System.out.println("Home Team " +homeTeam.getPlayers());
     
     visitingTeam.addPlayer(new Player("Wolverine"));
     visitingTeam.addPlayer(new Player("Emma Frost"));
     visitingTeam.addPlayer(new Player("Mystique"));
     visitingTeam.addPlayer(new Player("Deadpool"));
     visitingTeam.addPlayer(new Player("Magneto"));
     visitingTeam.addPlayer(new Player("Iron Man"));
     visitingTeam.addPlayer(new Player("Hulk"));
     visitingTeam.addPlayer(new Player("Black Widow"));
     visitingTeam.addPlayer(new Player("X-23"));

        myUtil.printTeam(visitingTeam);
      //  System.out.println("Visting Team " +visitingTeam.getPlayers());

    }
}


