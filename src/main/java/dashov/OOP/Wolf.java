package dashov.OOP;

public class Wolf extends Predator{
    @Override
    public void speed() {
        System.out.println("Wolf speed is 90 km/h.");
    }

    void eating() {
        System.out.println("Wolf is eating deer.");
    }
}
