import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Random random = new Random();
       Scanner scanner = new Scanner(System.in);

       int randNum = random.nextInt(100)+1;
       System.out.println(randNum);

    System.out.print("Guess a Number: ");
    int guessNum = scanner.nextInt();

    while(guessNum!=randNum){
        if(guessNum < randNum){
            System.out.println("The number is too low");
        }else if(guessNum > randNum){
            System.out.println("The number is too high");
        }

    System.out.print("Guess again: ");
    guessNum = scanner.nextInt();
    }
    System.out.print("Correct Answer");
       
    }
}