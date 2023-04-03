import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Player playerPrincipal = new Player("Diogo", 50, 3, 1);

        Monster monster1 = new Monster("Albergh", 20,2,2);
        Monster monster2 = new Monster("Valkyda", 30,3,3);
        Monster monster3 = new Monster("Labafech", 40,4,4);

        Level level1 = new Level(playerPrincipal, monster1);
        Level level2 = new Level(playerPrincipal, monster2);
        Level level3 = new Level(playerPrincipal, monster3);

        if (level1.Fight()){
            if (level2.Fight()){
                if (level3.Fight()){
                    System.out.println("Ganhou o jogo.");
                }
            }
        }
    }
}