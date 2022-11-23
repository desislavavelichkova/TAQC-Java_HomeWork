import java.util.Scanner;

import static java.lang.Math.random;

public class Task_4 {
    public static void main(String[] args) {
        //4.The program generates a random integer from 0 to 100.
        // The user must guess it in no more than 10 attempts.
        // After each unsuccessful attempt, program says if the number entered by user more or less than required number.
        // If the number is not guessed for 10 attempts, then display the guessed number.

        int randomNum = (int)(Math.random() * 101);

        for (int i = 0; i < 10; i++) {
            Scanner s = new Scanner(System.in);
            int num = Integer.parseInt(s.next());
            if (num == randomNum){
                System.out.println("Congratulation, you guess the number!");
                break;
            }
            else if (num > randomNum) {
                System.out.println("Your number is more than the random number!");
            }
            else if (num < randomNum) {
                System.out.println("Your number is less than the random number!");
            }
        }
        System.out.println("The random number is: " + randomNum);
    }

}
