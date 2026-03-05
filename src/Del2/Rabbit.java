package Del2;

public class Rabbit extends Animal {
    //konstruktør, som kalder superklassen Animal
    public Rabbit(String name, int energy) {
        super(name, energy);
    }

    //kaninen giver altid lav fast skade
    @Override
    public int attack() {
        return 3;
    }
}