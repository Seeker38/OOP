package lab7.Ex1_6;

public class TestMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("meo");
        cat1.greets();
        Dog dog1 = new Dog("cho 1");
        dog1.greets();
        BigDog bigDog1 = new BigDog("cho 2");
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat("meo 2");
        animal1.greets();
        Animal animal2 = new Dog("cho 3");
        animal2.greets();
        Animal animal3 = new BigDog(" cho 4");
        animal3.greets();

        // Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}
