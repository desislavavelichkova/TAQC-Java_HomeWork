package dashov.OOP;

public class Leopard extends Predator {

    public Leopard(String name, int size, int weight) {
        super(name, size, weight);
    }

    @Override
    void eatingOtherAnimal() {
        System.out.println("Leopard is eating antelopes.");
    }

    @Override
    public void speed() {
        System.out.println("Leopard speed is 140 km/h.");
    }
}
