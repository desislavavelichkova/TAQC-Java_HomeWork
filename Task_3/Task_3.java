import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args)
    {
        // 3.The YEAR is known.
        // Determine whether this year is intercalary and to what century this year belongs.

        Scanner s = new Scanner(System.in);
        int year = Integer.parseInt(s.next());

        if (year % 4 == 0)
        {
            System.out.println( year + " year is intercalary.");
        }
        else {
            System.out.println(year + " year is not intercalary.");
        }
        int century = year/100 +1;
        System.out.println(year + " year is in " + century + " century.");
    }
}