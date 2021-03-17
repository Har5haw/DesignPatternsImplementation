package Template;

public class Cricket extends Game{
    @Override
    void start() {
        System.out.println("starting Cricket");
    }

    @Override
    void tractScore() {
        System.out.println("tracking Cricket score");
    }

    @Override
    void endGame() {
        System.out.println("ending Cricket");
    }

    @Override
    void announceWinner() {
        System.out.println("Cricket winners");
    }
}
