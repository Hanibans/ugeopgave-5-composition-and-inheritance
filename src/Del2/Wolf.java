package Del2;

import java.util.Random;

public class Wolf extends Animal {
    //bruges til at lave tilfældig skade
    private Random random = new Random();

    //konstruktør, som kalder superklassen Animal
    public Wolf(String name, int energy) {
        super(name, energy);
    }

    //ulven giver tilfældig skade
    @Override
    public int attack() {
        return random.nextInt(10) + 1;
    }
}