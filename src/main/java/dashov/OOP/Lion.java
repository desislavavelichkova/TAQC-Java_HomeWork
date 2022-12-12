package dashov.OOP;

class Lion extends Predator implements Animal {
    @Override
    public void speed() {
        System.out.println("The Animal speed is 200 km/h ");
    }
    public void eating() {
        System.out.println("The Animal is eating meat");
    }
}
