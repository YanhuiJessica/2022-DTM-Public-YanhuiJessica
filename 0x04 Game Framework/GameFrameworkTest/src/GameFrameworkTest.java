public class GameFrameworkTest extends Game {
    public GameFrameworkTest(GameScene scene) {
        super(scene);
    }
    public static void main(String[] args) {
        GameFrameworkTest game = new GameFrameworkTest(new MyGameScene());
        game.setSize(640, 640);
        game.setVisible(true);
    }
}
