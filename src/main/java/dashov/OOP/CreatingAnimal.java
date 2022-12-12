/* Create hierarchy that contains at least two interfaces with abstract and default methods,
 one abstract class and three concrete classes. In this chain should be used overriding and overloading of methods.
 In some method implementation should be used List and Map and their processing using Streams.
 Other method implementation can be with only one line (for example System.out.println())
 Idea of classes can be any (Animals, City, Vehicle etc.). Any other addictions to this hierarchy are welcomed J.
*/

package dashov.OOP;

public  class CreatingAnimal {
    public static void main(String[] args){
        Lion lion1 = new Lion();
        lion1.speed();
        lion1.eating();


        Leopard leopard = new Leopard();
        leopard.speed();
        leopard.eating();

        leopard.goToSleep();
        lion1.goToSleep();
    }
}
