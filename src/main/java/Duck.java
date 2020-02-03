public class Duck {

    protected String color;
    protected int weight;
    protected String name;

    public Duck(String color, int weight, String name) {
        this.color = color;
        this.weight = weight;
        this.name = name;
    }


    public String makeSound() {
        return "Duck makes a some sound";
    }


}
