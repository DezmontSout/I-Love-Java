public class WildDuck extends Duck {

    private int numberOfFlight;

    public WildDuck(String color, int weight, String name, int numberOfFlight) {
        super(color, weight, name);
        this.numberOfFlight = numberOfFlight;
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }

    public void setNumberOfFlight(int numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }

    @Override
    public String toString() {
        return "WildDuck{" +
                "numberOfFlight=" + numberOfFlight +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("I can fly, stupid human! You can't kill me!");
    }
}
