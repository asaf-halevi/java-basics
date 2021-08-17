package _10_interfaces.examples.ex04_java8_default;

public class UseHammer {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new TankDriver();
        persons[1] = new Carpenter();
        persons[2] = new Singer();

        for (Person person : persons) {
            person.whoAmI();
            if (person instanceof IHammerUser) {
                System.out.println("The hammer's weight is:" + ((IHammerUser) person).getHammerWeight() + "\n");
            }
        }
    }
}
