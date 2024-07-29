public class Paramedics extends Rescuer {
    private FirstAidKit firstAidKit;

    public Paramedics(FirstAidKit firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public Paramedics(String name, int age, String position, Knapsack knapsack, FirstAidKit firstAidKit) {
        super(name, age, position, knapsack);
        this.firstAidKit = firstAidKit;
    }

    public void firstHelp () {
        System.out.println(" Парамедики может окозывать первую помощь");

    }
    public void fireFighter()  {
        System.out.println(" Пожарные может тушить пожар ");
    }
}
