package Template;

public abstract class Game {
    abstract void start();
    abstract void tractScore();
    abstract void endGame();
    abstract void announceWinner();

    //Template method
    public void play(){
        start();;
        tractScore();;
        endGame();
        announceWinner();
    }

}
