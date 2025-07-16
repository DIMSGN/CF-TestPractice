package gr.aueb.cf.ch15;

public class Cat extends Animal{
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("I am a cat");
    }
}
