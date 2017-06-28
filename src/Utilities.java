/**
 * Created by MDS1728 on 6/1/2017.
 */
public class Utilities {
    public static void main(String[] args) {
    }
    //extends BaseballGame class

    //constructor

    {

    }
    //  determines outs and bases from random number

    public class atBat {
        public void main(String[] args) {
            atBat myatBat = new atBat();
            int score = myatBat.randomNumber(100);
            if (score <= 70)
                System.out.println("Out");
            else if (score >= 71 && score <= 87)
                System.out.println("Single");
            else if (score >= 88 && score <= 94)
                System.out.println("Double");
            else if (score >= 95 && score <= 96)
                System.out.println("Tripple");
            else if (score >= 97 && score <= 100)
                System.out.println("Home Run");
        }

        //Generates random number
        public int randomNumber(int limit) {
            int score;
            score = ((int) (Math.random() * limit)) + 1;
            //Remove comment to show random number
            System.out.println(score);
            return score;


            //Prints Array, Double Array or array list}
        }
    }
}