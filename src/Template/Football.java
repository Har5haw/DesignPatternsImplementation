package Template;

public class Football extends Game{
    @Override
    void start() {
        System.out.println("starting Football");
    }

    @Override
    void tractScore() {
        System.out.println("tracking Football goals");
    }

    @Override
    void endGame() {
        System.out.println("ending Football");
    }

    @Override
    void announceWinner() {
        System.out.println("Football winners");
    }
}
