package constructor.prog1;

public class Dog extends  Animal{
    @Override
    public void makeSound() {
       // If you want to use output of Parent class also then use super
        // super.makeSound();
        System.out.println("Barking");
    }

    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.makeSound();
    }
}
