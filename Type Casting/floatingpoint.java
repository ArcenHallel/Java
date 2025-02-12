public class floatingpoint {
    public static void main(String[] args){

    // set the maximum possible score in the game to 500
int maxScore = 500;

    // the actual score of the user
int userScore = 423;

    /* Calculate the percentage of the user's score in relation to the maximum available score
    Convert userScore to float to make sure that the division is accurate */
float percentage = (float) userScore / maxScore * 100.0f;

    //print the result
    System.out.println("User's percentage is "+ percentage);

   }
}