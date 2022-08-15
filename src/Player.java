import java.util.Scanner;

public class Player {
    int pguessNumber;
    int guessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player:Kindly guess the number");
        pguessNumber=sc.nextInt();
        return pguessNumber;
    }
}
