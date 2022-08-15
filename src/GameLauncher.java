public class GameLauncher {

    public static void main(String[] args) {
	Umpire ump = new Umpire();
    ump.collectNumFromGuesser();
    ump.collectNumFromPlayer();
    ump.compare();
    }
}
