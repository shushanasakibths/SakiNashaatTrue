public class Game {
    private String gameName;
    private int players;
    private int score;

    public Game(String gameName, int players) {
        this.gameName = gameName;
        this.players = players;
        score = 0;
    }

    public String getGameName() {
        return gameName;
    }
    public int getPlayers() {
        return players;
    }

    public int getScore() {
        return score;
    }

    public void addPlayer(){
        players++;
    }
    public void increaseScore(int increase){
        score = score + increase;
    }


    public double averageScorePerPlayer() {
        double  averageScorePerPlayer = (double) score / players;
        return averageScorePerPlayer;
    }

    public boolean isGameOver() {
        return score > 9;
    }
}
