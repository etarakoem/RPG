public class App {
    public static void main(String[] args) throws Exception {
        Character player1 = new Character("Linh",100,10,0,0);
        Character player2 = new Character("Phuc",100,10,0,0);

        GameEngine game1 = new GameEngine(player1, player2);
        player1.hitHealth(10);
        player1.attUp(20);

        System.out.println(player1);
        player1.attDown(20);
        player1.heal(10);
        System.out.println(player1);
    }
}
