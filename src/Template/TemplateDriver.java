package Template;

public class TemplateDriver {
    public static void main(String args[]){
        Game game = new Football();
        game.play();

        game = new Cricket();
        game.play();
    }
}
