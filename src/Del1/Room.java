package Del1;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    //konstruktør, som bliver kaldt når vi laver en ny Room
    public Room(String name) {
        this.name = name;

        // vi laver tomme lister når rummet oprettes
        lamps = new ArrayList<>();
        windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        return lamps.size();
    }

    public int getTotalWatt() {
        int sum = 0;

        //loop gennem alle lamper
        for (Lamp l : lamps) {
            sum += l.getWatt(); //læg lampens watt til summen
        }
        return sum;
    }

    public int getTotalWindowArea() {
        int sum = 0;

        //loop gennem alle vinduer
        for (Window w : windows) {
            sum += w.getArenaCm2();
        }
        return sum;
    }

    public void printRoom() {
        System.out.println(name + " (" + lamps.size() + " lamper, " + windows.size() + " vinduer)");
        System.out.print(" Lamper: ");
        for (Lamp l : lamps) {
            System.out.print(l + " "); //bruger lampens toString()
        }
        System.out.println("(total: " + getTotalWatt() + "W)");
        System.out.print(" Vinduer: ");
        for (Window w : windows) {
            System.out.print(w + " "); //bruger vinduets toString()
        }
        System.out.println("\n");
    }
}
