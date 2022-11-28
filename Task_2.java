import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args)
    {
        // 2.The user enters a number, the program must display its description.
        // For example, "positive one-digit", "negative two-digit" etc.

        Scanner s = new Scanner(System.in);
        String c = s.next();
        int count = c.length();
        double number = Double.parseDouble(c);

        if (number >= 0)
        {
            System.out.println("positive "+count+"-digit");
        }
        else if (number < 0)
        {
            System.out.println("negative "+(count-1)+"-digit");
        }

    }
}