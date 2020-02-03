public class NavalniyDuck extends Duck {

    private int daysInPrison;


    public NavalniyDuck(String color, int weight, String name, int daysInPrison) {
        super(color, weight, name);
        this.daysInPrison = daysInPrison;
    }

    @Override
    public String toString() {
        return "NavalniyDuck{" +
                "daysInPrison=" + daysInPrison +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String makeSound() {
        return "Путина избрали на 10ый срок, поэтому го на митинг, пацаны";
    }

    public void organizeMeeting(int theCostOfTheHouseNextDeputy) {
        if (IsAPossibilityForOrganizeMeeting(theCostOfTheHouseNextDeputy)) {
            System.out.println("Вы организовали митинг, как обычно ничего не изменилось");
            daysInPrison += 30;
        }
        else {
            System.out.println("Митинг не одобрили, попробуйте в следующий раз");
        }
    }

    private boolean IsAPossibilityForOrganizeMeeting(int theCostOfTheHouseNextDeputy) {
        return theCostOfTheHouseNextDeputy > 1000000;
    }

}
