package dashov.OOP;
class Lion extends Predator {
    public Lion(String name, int size, int weight) {
        super(name, size, weight);
    }

//Overriding method speed that is declared without body in Interface Animal
    @Override
    public void speed() {
        System.out.println("The Animal speed is 200 km/h");
    }

    public void eatingOtherAnimal() {
        System.out.println("Animal is eating meat");
    }
}