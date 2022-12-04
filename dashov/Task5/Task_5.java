package dashov.Task5;// Create a dictionary with the keys of which are the countries
// and the values of which are a list of the major cities of that country.

// When user enters the city, the program should display the country in which it is located.


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        HashMap<String, String[]> countryBook = new HashMap<String, String[]>();

        countryBook.put("UK", new String[] {"London","Cambridge"});
        countryBook.put("Germany", new String[] { "Berlin","Hamburg", "hamburg"});
        countryBook.put("Austria", new String[] {"Vienna","Insbruck"});
        countryBook.put("Bulgaria", new String[] {"Sofia","Varna"});

        System.out.println(countryBook);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city: ");
        String enteredCityFromUser = scanner.nextLine();

        for (Map.Entry<String, String[]> entry : countryBook.entrySet()) {
            String[] citiesArray = entry.getValue();

            for (int i=0; i <citiesArray.length; i++) {
                if(citiesArray[i].contains(enteredCityFromUser))
                {
                    System.out.println(entry.getKey());
                }
            }
        }
    }

}