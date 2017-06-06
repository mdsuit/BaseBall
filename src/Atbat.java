/**
 * Created by mdsui on 6/6/2017.
 */
public class Atbat {

    public int randomNumber(int limit) {
        int number;
        number = ((int) (Math.random() * limit)) + 1;
        return number;
    }
}
