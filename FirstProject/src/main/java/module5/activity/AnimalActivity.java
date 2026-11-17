package module5.activity;

public class AnimalActivity {

    public static void main(String arg[]) {

        // TODO: Use interfaces to declare identifiers instead of the actual classes
        // create Cat using interface Animal
        Animal animal1 = new Cat();

        // TODO: Create Dog using interface Animal
        Animal animal2 = new Dog();

        Mammal mammal = new Mammal("Flexy");

        // TODO: For mammal set animal to cat
        mammal.setAnimal(animal1);

        // TODO: Execute for mammal animalIsSleeping()
        mammal.animalIsSleeping();

        // TODO: Execute for mammal animalIsSpeaking()
        mammal.animalIsSpeaking();

        // TODO: For mammal set animal to dog
        mammal.setAnimal(animal2);

        // TODO: Execute for mammal animalIsSleeping()
        mammal.animalIsSleeping();

        // TODO: Execute for mammal animalIsSpeaking()
        mammal.animalIsSpeaking();
    }
}
