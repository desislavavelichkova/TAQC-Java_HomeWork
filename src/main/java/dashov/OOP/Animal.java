package dashov.OOP;

interface Animal {

    void speed();
    default void goToSleep() {
        System.out.println("Zzzzz");
    }

}

