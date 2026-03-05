package Del2;

public class Contest {
    //de to dyr der kæmper
    private Animal a1;
    private Animal a2;

    //tæller runder
    private int round;

    //konstruktør
    public Contest(Animal a1, Animal a2) {
        this.a1 = a1;
        this.a2 = a2;
        round = 1;
    }

    public void playRound() {
        System.out.println("\n--- Runde " + round + " ---");

        //dyr 1 angriber dyr 2
        int damage1 = a1.attack();

        //trækker energi fra modstanderen
        a2.setEnergy(a2.getEnergy() - damage1);

        System.out.println(a1.getName() + " angriber " + a2.getName() + " for " + damage1 + "! (" + a2.getName() + " har " + a2.getEnergy() + " energi tilbage)");

        //hvis dyr 2 stadig er aktivt kan det angribe tilbage
        if (a2.isActive()) {
            int damage2 = a2.attack();
            a1.setEnergy((a1.getEnergy() - damage2));

            System.out.println(a2.getName() + " angriber " + a1.getName() + " for " + damage2 + "! (" + a1.getName() + " har " + a1.getEnergy() + " energi tilbage)");
        }
        round++;
    }

    //returnerer vinderen
    public Animal getWinner() {
        if (!a1.isActive()) return a2;
        if (!a2.isActive()) return a1;

        //hvis begge stadig lever
        return null;
    }
}