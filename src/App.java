public class App {
    public static void main(String[] args) throws Exception {
        Character player1 = new Character("Linh",100,10,0,0);
        Character player2 = new Character("Phuc",100,10,0,0);

        GameEngine game1 = new GameEngine(player1, player2);
        game1.showHealth();
        player1.hitHealth(10);
        game1.showHealth();
    }
}
