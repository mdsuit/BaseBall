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

        System.out.println("This is the result in this run "+atBatResult);

      //  String[][] numbers = new String[9][9];
        ArrayList players;
        players = new ArrayList();
        players.size();
        players.add("Player 1");
        players.add("Player 2");
        players.add("Player 3");
        players.add("Player 4");
        players.add("Player 5");
        players.add("Player 6");
        players.add("Player 7");
        players.add("Player 8");
        players.add("Player 9");
        System.out.println();


        /*
        for (int row = 0; row < players.length; row++) {
            for (int col = 0; col < players[row].length; col++) {
                players[row][col] = String.valueOf(row) + String.valueOf(col);
                System.out.print(players[row][col] + " ");
            }
            System.out.println(" ");
            */
        }

    }


