/**
 * Created by mdsui on 6/6/2017.
 */
public class Innings {

     public static void main(String[] args) {
         //  determines outs and bases from random number
         Innings myInnings = new Innings();
         int score = myInnings.randomNumber(100);
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
        // Remove comment to show random number
        // System.out.println(score);
        return score;
    }

}
