public class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
 void collectNumFromGuesser(){
     Guesser g = new Guesser();
     numFromGuesser=g.guessNumber();
 }
 void collectNumFromPlayer(){
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    numFromPlayer1=p1.guessNumber();
    numFromPlayer2=p2.guessNumber();
    numFromPlayer3=p3.guessNumber();
    }
 void compare(){
      if(numFromGuesser==numFromPlayer1){
          System.out.println("Player 1 won the game");
      }
      else if(numFromGuesser==numFromPlayer2){
         System.out.println("Player 2 won the game");
     }
      else if(numFromGuesser==numFromPlayer3){
          System.out.println("Player 3 won the game");
      }
      else
          System.out.println("All the players lost");
 }
}
