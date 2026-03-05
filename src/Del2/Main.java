package Del2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Simba", 80));
        animals.add(new Wolf("Wolf", 60));
        animals.add(new Rabbit("Bunny", 50));
        animals.add(new Lion("Mufasa", 90));

        //dyr kæmper i par
        for (int i = 0; i < animals.size(); i += 2) {
            Animal a1 = animals.get(i);
            Animal a2 = animals.get(i + 1);

            //laver en kamp
            Contest c = new Contest(a1, a2);

            //spil runder indtil der er en vinder
            while (c.getWinner() == null) {
                c.playRound();
            }

            //print vinder
            System.out.println("Vinder; " + c.getWinner());
            System.out.println();
        }
    }
}
