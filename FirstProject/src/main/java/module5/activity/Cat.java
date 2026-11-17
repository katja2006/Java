package module5.activity;

// TODO: Cat class should implement Animal
public class Cat implements Animal {

    // TODO: Create method animalSound()
    // and its implementation should print:
    // "Cat says: 'Meow Meow'!"

    @Override
    public void animalSound() {

        System.out.println("Cat says: 'Meow Meow'!");
    }

    // TODO: Create method sleep()
    // and its implementation should print:
    // "Cat is sleeping!"

    @Override
    public void sleep() {

        System.out.println("Cat is sleeping!");
    }
}
