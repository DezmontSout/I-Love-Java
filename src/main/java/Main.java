public class Main {

    public static void main(String[] args) {
        DomesticDuck duck = new DomesticDuck("Red", 21, "Vasya", true, 200);
        DomesticDuck duck2 = new DomesticDuck("Red", 21, "Vasya", false, 200);
        DomesticDuck duck3 = new DomesticDuck("Red", 21, "Vasya", true, 200);
        NavalniyDuck navalniyDuck = new NavalniyDuck("Yellow", 2, "Aleksey", 333);
        WildDuck wildDuck = new WildDuck("Green", 13, "Petya", 10);
        /**
         * Сравниваем с помощью equals трех уток. У первой и у третьей все поля равны
         */
        System.out.println("duck equals duck2 = " + duck.equals(duck2));
        System.out.println("duck equals duck3 = " + duck.equals(duck3) + "\n");
        /**
         * Высчитываем хеш у трех уток. У первой и у третьей все поля равны
         */
        System.out.println("HashCode for duck = " + duck.hashCode());
        System.out.println("HashCode for duck2 = " + duck2.hashCode());
        System.out.println("HashCode for duck3 = " + duck3.hashCode() + "\n");
        /**
         * Демонстрируем полиморфизм.
         */
        Duck[] ducks = new Duck[3];
        ducks[0] = duck;
        ducks[1] = wildDuck;
        ducks[2] = navalniyDuck;
        for (Duck value : ducks) {
            System.out.println(value.makeSound());
        }
        System.out.println("\n");
        /**
         * Демонстрация работы паблик метода, который внутри содержит приватный метод.
         */
        navalniyDuck.organizeMeeting(1000000000);
    }
}
