package gr.aueb.cf.ch15;

public class Dog extends Animal {
    @Override
    public void speak() {
        super.speak();
        System.out.println("I am a dog");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
