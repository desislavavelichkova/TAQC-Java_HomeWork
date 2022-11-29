//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public Task_4() {
    }

    public static void main(String[] args) {
        Random randI = new Random();
        int myRandInt = randI.nextInt(100);

        for(int i = 0; i < 10; ++i) {
            Scanner myInput = new Scanner(System.in);
            System.out.print("Enter number: ");
            String numberString = myInput.nextLine();

            Integer number;
            try {
                number = Integer.parseInt(numberString);
            } catch (NumberFormatException var8) {
                System.out.println("Entered string is not a valid number");
                return;
            }

            if (number == myRandInt) {
                System.out.println("You have entered the right number!");
                break;
            }

            System.out.println("Try again.");
        }

        System.out.println("You had 10 attempts only..");
    }
}
