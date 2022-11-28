import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args)
    {
        // 1.Is it possible to place a
        // round stage with radius R in a square hall of square S
        // so that there is a passage was at least K from the wall to the stage?

        Scanner s = new Scanner(System.in);
        System.out.print("R: ");
        double R = Double.parseDouble(s.next());
        System.out.print("S: ");
        double S = Double.parseDouble(s.next());
        System.out.print("K: ");
        double K = Double.parseDouble(s.next());

        if ((2*R) > Math.sqrt(S)){
            System.out.println("It is imposible to place a round stage with radius R in a square hall of square S so that there is a passage was at least K from the wall to the stage.");
        }
        else if ((2*R) == Math.sqrt(S)) {
            System.out.println("It is imposible to place a round stage with radius R in a square hall of square S so that there is a passage was at least K from the wall to the stage.");
        }
        else if ((2*R) < Math.sqrt(S) && (Math.sqrt(S) - (2*R)) < K) {
            System.out.println("It is imposible to place a round stage with radius R in a square hall of square S so that there is a passage was at least K from the wall to the stage.");
        }
        else if ((2*R) < Math.sqrt(S) && (Math.sqrt(S) - (2*R)) >= K) {
            System.out.println("It is posible to place a round stage with radius R in a square hall of square S so that there is a passage was at least K from the wall to the stage.");
        }
    }
}