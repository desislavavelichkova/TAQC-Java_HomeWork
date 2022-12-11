package OOP;

class Lion extends Predator implements Animal {
    @Override
    public void animalSpeed() {
        System.out.println("The Animal speed is 200 km/h ");
    }
    public void eating() {
        System.out.println("The Animal is eating meat");
    }
}
