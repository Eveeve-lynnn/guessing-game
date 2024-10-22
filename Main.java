import java.util.Random;
import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(100);
        int guess;

        System.out.println("Enter your first guess")
        guess = scan.nextInt();
        int count=0;//count the number of times user guesses

        while(guess!=x){
            //if x less than , greater than or equal 
            count = count + 1;

            if (guess < x) {
                System.out.println("it is too low");

            } else if (guess > x) {
                System.out.println("it is too high");

            }
            System.out.println("next");
            guess = scan.nextInt();
        }

        if (count <= 7) {
            System.out.println("you're impossibly good");
        } else if (count <= 10) {
            System.out.println("Good job");
        } else {
            System.out.println("Try divide and conquer next time.");
        }


        //how well did you do
    }
}
