public class AnimalRegistry {
    private Sheep sheepPrototype = new Sheep();
    private Cow cowPrototype = new Cow();
    private Horse horsePrototype = new Horse();


    public Animal createSheep(String name) {
        Sheep clonedSheep = (Sheep) sheepPrototype.clone();
        clonedSheep.setName(name);
        return clonedSheep;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
