package dashov.Task2;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.print("Enter number: ");
        String numberString = myInput.nextLine();
        Integer number;

        try {
            number = Integer.parseInt(numberString);
        } catch (NumberFormatException e) {
            System.out.println("Entered string is not a valid number");
            return;
        }

        if (number < 0) {
            System.out.println("negative " + (Integer.toString(number).length() - 1) + "-digit");
        } else {
            System.out.println("positive " + Integer.toString(number).length() + "-digit");
        }
    }
}
