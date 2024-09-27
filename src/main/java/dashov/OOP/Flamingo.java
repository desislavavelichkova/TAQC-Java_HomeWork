package dashov.OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class
Flamingo implements Bird {
    @Override
    public void speed() {
        System.out.println("Flamingo speed is 20 km/h");
    }

    @Override
    public void fly() {
        System.out.println("Flamingo can fly");
    }

    public void otherFlamingoData() {
        // Creating an empty HashMap
        Map<String, String> classification
                = new HashMap<String, String>();

        // Inserting pairs in above Map
        // using put() method
        classification.put("Kingdom", "Animalia");
        classification.put("Phylum", "Chordata");
        classification.put("Family", "Phoenicopteridae");
        classification.put("Class", "Aves");
        classification.put("K", "Something");

        //Streaming and then filtering the keys from HashMap that start with letter K and returning theirs values as a List
        List<String> newList = classification.entrySet().stream()
                .filter(e -> e.getKey().startsWith("K"))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        System.out.println(newList);
    }

    public void eatsFoodThatStartWithS() {
        List<String> food = new ArrayList<>();

        // Adding elements in the List
        food.add("insects");
        food.add("shrimp");
        food.add("fish");
        food.add("seed");

        System.out.println("Food that the flamingo eats that start with letter 's': ");

        //Filter and print  food starting with "S"
        List<String> result = food.stream().filter(s -> s.startsWith("s")).
                collect(Collectors.toList());
        System.out.println(result);
    }
}
