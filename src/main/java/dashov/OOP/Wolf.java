package dashov.OOP;
public class Wolf extends Predator{
    public Wolf(String name, int size, int weight) {
        super(name, size, weight);
    }
    @Override
    public void speed() {
        System.out.println("Wolf speed is 90 km/h.");
    }
    //Overloading method
    public void eatingOtherAnimal() {
        System.out.println("Wolf is eating deer.");
    }
}