import java.util.Scanner;

public class Player {
    static int i=0;
    int pguessNumber;
    int guessNumber(){
        i++;
        Scanner sc = new Scanner(System.in);
        System.out.println("Player "+ i +" :Kindly guess the number");
        pguessNumber=sc.nextInt();
        return pguessNumber;
    }
}
