import java.util.Objects;

public class DomesticDuck extends Duck {

    private boolean flyable;
    private int numberOfDaysToKill;

    public DomesticDuck(String color, int weight, String name, boolean flyable, int numberOfDaysToKill) {
        super(color, weight, name);
        this.flyable = flyable;
        this.numberOfDaysToKill = numberOfDaysToKill;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public int getNumberOfDaysToKill() {
        return numberOfDaysToKill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomesticDuck)) return false;
        DomesticDuck that = (DomesticDuck) o;
        return isFlyable() == that.isFlyable() &&
                getNumberOfDaysToKill() == that.getNumberOfDaysToKill();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFlyable(), getNumberOfDaysToKill());
    }

    @Override
    public String toString() {
        return "DomesticDuck{" +
                "flyable=" + flyable +
                ", numberOfDaysToKill=" + numberOfDaysToKill +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String makeSound() {
        return "Please don't kill me, human";
    }
}
