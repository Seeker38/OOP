package lab6.Ex1_5;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
