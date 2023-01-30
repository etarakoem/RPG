public class GameEngine {
    Character _player1;
    Character _player2;

    public GameEngine(Character player1, Character player2){
        _player1 = player1;
        _player2 = player2;
    }
    public static void showHealth(){
        String health1 = "";
        for (int i = 0; i< (int)_player1.getHealth(); i++){
            health1.concat("#");
        }

        String health2 = "";
        for (int i = 0; i< (int)_player2.getHealth(); i++){
            health1.concat("#");
        }

        System.out.println(_player1.getName()+"'s hp: \n"+ health1);
        System.out.println(_player2.getName()+"'s hp: \n"+ health2);
    }
}
