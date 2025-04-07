public class TestAnimal {

    public static void main(String[] args) {
        AnimalRegistry animalRegistry = new AnimalRegistry();

        Animal sheep = animalRegistry.createSheep(" Sheepyyy2");
        Animal cow = animalRegistry.createCow();
        Animal horse = animalRegistry.createHorse();

        System.out.println("The " + sheep.getType() + " : "); 
        sheep.makeSound();
        
        System.out.println("The " + cow.getType() + " : "); 
        cow.makeSound();

        System.out.println("The " + horse.getType() + " : ");
        horse.clone();
        horse.makeSound();
      
    }
}