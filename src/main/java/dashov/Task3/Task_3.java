package dashov.Task3;

class Task_3 {
    static void find_century(int year) {
        if (year <= 0)
            System.out.print("0 and negative is not allow"
                    + "for a year");
        else if (year <= 100)
            System.out.print("1st century\n");

        else if (year % 100 == 0)
            System.out.print(year / 100 + " century\n");

        else
            System.out.print(year / 100 + 1 + " century\n");
    }

    static void is_year_intercalary(int year){
        boolean leap;

        if (year % 4 == 0) {
            leap = true;

            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
        } else leap = false;
        if (leap)
            System.out.println(year + " is a intercalary year.\n");
        else
            System.out.println(year + " is not a intercalary year.\n");
    }

    public static void main(String[] args) {
        int year = 1996;
        find_century(year);
        is_year_intercalary(year);

    }
}