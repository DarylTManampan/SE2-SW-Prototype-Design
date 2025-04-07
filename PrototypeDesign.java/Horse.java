public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse() {
        this.legs = 4;
        this.sound = "Neighhhh";
        this.food = "Hays";
        this.color = "White";
    }

    @Override
    public Animal clone() {
        Horse cloned = new Horse();
        cloned.legs = this.legs;
        cloned.sound = this.sound;
        cloned.food = this.food;
        cloned.color = this.color;
        System.out.println(" which is color " + color + " with " + legs + " legs"  + " is eating " + food);
        return cloned;
    }

    @Override
    public void makeSound() {
        System.out.println(" goes " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}