package methods;

public class Methods {

    public static void main(String args[]) {
        String playerName = "Tharun";
        int position = 1;

        displayHighScorePosition(playerName, position);

        int[] scores = {1500, 900, 400, 50};

        for(int i = 0; i < scores.length; i++) {
            int result = calculateHighScorePosition(scores[i]);
            System.out.println(result);
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000) {
            return 1;
        } else if(score >= 500) {
            return 2;
        } else if(score >= 100) {
            return 3;
        }
        return 4;
    }
}
