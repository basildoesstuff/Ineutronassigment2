import java.util.Scanner;

public class Guesser {
    int guessnum;
    int guessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser : kindly Guess the number ");
        guessnum=sc.nextInt();
        return guessnum;
    }
}
