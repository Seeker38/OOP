package lab6.Ex1_5;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("meo");
        System.out.println(cat);
        cat.greets();

        Dog dog = new Dog("cho");
        System.out.println(dog);
        dog.greets();
        Dog dog1 = new Dog("cho den");
        dog.greets(dog1);
    }
}
