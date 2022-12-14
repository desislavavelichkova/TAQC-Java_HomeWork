package dashov.OOP;
public interface Bird extends Animal{
    //method that must be implemented in concrete classes that implements Bird Interface
    void fly();
    //method that is defined in interface and can&#39;t be changed or overridden from Classes
    default void feathersFall(){
        System.out.println("Birds feathers fall down");
    }
}
