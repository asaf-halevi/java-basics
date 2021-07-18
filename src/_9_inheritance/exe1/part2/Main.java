package _9_inheritance.exe1.part2;

/**
 * Define base class �Animal�. It will have the following members:
 * -String name
 * -String color
 * <p>
 * Add constructors, setters & getters.
 * <p>
 * Add the following methods:
 * -whoAmI � prints �I�m a generic Animal�
 * -makeSound � prints �? ? ? �
 * <p>
 * Define the class �Dog� that inherits from �Animal�.
 * Override the �whoAmI� & �makeSound� methods to print dog related texts.
 * <p>
 * Define the class �Cat� that inherits from �Animal�.
 * Override the �whoAmI� & �makeSound� methods to print cat related texts.
 * <p>
 * Create main that uses the classes. Use the getters & setters for dog & cat.
 * Use polymorphism: Create array of Animals and in each element add dog or cat.
 * <p>
 * Part 2:
 * Change the �whoAmI� method of the last exercise to be �toString�.
 * <p>
 * Do it in all the classes.
 * <p>
 * In the Main class � use it in order to print the instances.
 *
 * @author Tal Green
 */
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Rexy", "Black");
        System.out.println(d.getColor()); // Dog have 'getColor' method - He got it from the base class Animal
        System.out.println(d);
        d.makeSound();

        System.out.println();

        Cat c = new Cat("Lady", "White");
        System.out.println(c);
        c.makeSound();

        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Pez", "Brown");
        animals[1] = new Cat("Garfield", "Orange");
        animals[2] = new Dog("Dilan", "White");
        animals[3] = new Cat("Gilbert", "Gray");

        System.out.println();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            animals[i].makeSound();
        }

    }
}
