package Del2;

public class Lion extends Animal {
    //konstruktør, som kalder superklassen Animal
    public Lion(String name, int energy) {
        super(name, energy);
    }

    //løven giver altid høj fast skade
    @Override
    public int attack() {
        return 15;
    }
}