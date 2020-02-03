public class Main {

    public static void main(String[] args) {
        DomesticDuck duck = new DomesticDuck("Red", 21, "Vasya", true, 200);
        DomesticDuck duck2 = new DomesticDuck("Red", 21, "Vasya", false, 200);
        DomesticDuck duck3 = new DomesticDuck("Red", 21, "Vasya", true, 200);
        NavalniyDuck navalniyDuck = new NavalniyDuck("Yellow", 2, "Aleksey", 333);
        System.out.println("duck equals duck2 = " + duck.equals(duck2));
        System.out.println("duck equals duck3 = " + duck.equals(duck3) + "\n");
        System.out.println("HashCode for duck = " + duck.hashCode());
        System.out.println("HashCode for duck2 = " + duck2.hashCode() + "\n");
        duck.makeSound();
        navalniyDuck.makeSound();
        System.out.println("\n");
        navalniyDuck.organizeMeeting(1000000000);
    }
}
