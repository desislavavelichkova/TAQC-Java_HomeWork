package dashov.OOP;
interface Animal {
    void speed();
    default void sleep() {
        System.out.println("Zzzzz");
    }
}