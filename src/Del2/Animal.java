package Del2;

//abstrakt klasse
public abstract class Animal {
    private String name;
    private int energy;

    //konstruktør, som bruges af alle subklasser
    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    //ændrer energi (bruges når dyret tager skade)
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    //returnerer true hvis dyret stadig er med i konkurrencen
    public boolean isActive() {
        return energy > 0;
    }

    //abstrakt metode
    //alle dyr angriber forskelligt, så hver subklasse skal selv implementere den
    public abstract int attack();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " \"" + name + "\" (energi: " + energy + ")";
    }
}