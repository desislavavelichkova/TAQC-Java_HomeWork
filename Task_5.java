import java.util.*;

public class Task_5 {
    public static void main(String[] args) {
        //5.Create a dictionary with the keys of which are the countries
        // and the values of which are a list of the major cities of that country.
        // When user enters the city,
        // the program should display the country in which it is located.

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the town: ");
        String town = s.next();

        HashMap<String, LinkedList<String>> dic = new HashMap<String, LinkedList<String>>();
        LinkedList<String> townsBG = new LinkedList<String>();
        townsBG.add("Sofia");
        townsBG.add("Plovdiv");
        townsBG.add("Varna");
        dic.put("Bulgaria", townsBG);

        LinkedList<String> townsSP = new LinkedList<String>();
        townsSP.add("Madrid");
        townsSP.add("Barcelona");
        townsSP.add("Valladolid");
        dic.put("Spain", townsSP);
        boolean isExist = false;
        for (String i : dic.keySet()) {
            isExist = dic.get(i).contains(town);
            if (isExist == true) {
                System.out.println("The country is: "+i);
                break;
            }
        }
        if (!isExist){
            System.out.println("Your town don't exist!");
        }
    }
}



