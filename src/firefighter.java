public class firefighter extends Rescuer {
    private Equipment equipment;

    public firefighter() {
    }

    public firefighter(Equipment equipment) {
        this.equipment = equipment;
    }

    public firefighter(String name, int age, String position, Knapsack knapsack, Equipment equipment) {
        super(name, age, position, knapsack);
        this.equipment = equipment;
    }
}
