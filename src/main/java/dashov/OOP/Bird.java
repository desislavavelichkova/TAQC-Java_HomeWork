package dashov.OOP;

public interface Bird extends Animal{

     void canFly();
     default void feathersFall(){
         System.out.println("Bird feathers fall down..");
     }

}
