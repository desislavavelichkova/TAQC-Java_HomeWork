package dashov.OOP;

abstract class Predator implements Animal {
    private final String name;
    private final int size;
    private final int weight;

    //Creating constructor with name, size and weight for the predator
    public Predator(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    //Abstract method so when Predator class is inherited, the eatingOtherAnimal can be implemented with the right animal that the Predator eats.
    abstract void eatingOtherAnimal();
}
