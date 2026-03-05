package Del1;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    //konstruktør, som bliver kaldt når vi laver en ny Building
    public Building(String name) {
        this.name = name;

        //starter med en tom liste af rum
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    //beregner samlet antal lamper i hele bygningen
    public int getTotalLampCount() {
        int total = 0;

        //loop gennem alle rum
        for (Room r : rooms) {
            total += r.getLampCount();
        }
        return total;
    }

    //beregner samlet watt i hele bygningen
    public int getTotalWatt() {
        int total = 0;

        //loop gennem alle rum
        for (Room r : rooms) {
            total += r.getTotalWatt();
        }
        return total;
    }

    //printer hele bygningen
    public void printBuilding() {
        System.out.println("=== " + name + " ===\n");

        //print hvert rum
        for (Room r : rooms) {
            r.printRoom();
        }
        //print total information
        System.out.println("Total: " + getTotalLampCount() + " lamper, " + getTotalWatt() + "W");
    }
}
