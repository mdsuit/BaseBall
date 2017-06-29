import java.util.ArrayList;

/**
 * Created by mdsui on 6/6/2017.
 */
public class Team {


    private String name;
    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addPlayer(Player newPlayer){
    this.players.add(newPlayer);

    }
}
