/* Create hierarchy that contains at least two interfaces with abstract and default methods,
 one abstract class and three concrete classes. In this chain should be used overriding and overloading of methods.
 In some method implementation should be used List and Map and their processing using Streams.
 Other method implementation can be with only one line (for example System.out.println())
 Idea of classes can be any (Animals, City, Vehicle etc.). Any other addictions to this hierarchy are welcomed J.
*/

package dashov.OOP;

public  class CreatingAnimal {
    public static void main(String[] args){

        //Creating lion object with name, size and weight
        Lion lion = new Lion("Lio", 190, 100);
        //Calling methods that are overridden
        lion.speed();
        lion.eatingOtherAnimal();

        //Creating leopard object with name, size and weight
        Leopard leopard = new Leopard("Phil", 130, 70);
        //Calling methods that are overridden
        leopard.speed();
        leopard.eatingOtherAnimal();

        //Calling methods that are defined in Interface and can't be overridden
        leopard.sleep();
        lion.sleep();

        //Creating flamingo object
        Flamingo flamingo = new Flamingo();

        //Prints flamingo food with letter S
        flamingo.eatsFoodThatStartWithS();

        //Prints other flamingo data from HashMap where the key starts with K
        flamingo.otherFlamingoData();
    }
}
