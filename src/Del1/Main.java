package Del1;

public class Main {
    public static void main(String[] args) {

        Building b = new Building("Kontorbygningen");

        Room meeting = new Room("Mødelokale");
        meeting.addLamp(new Lamp(60));
        meeting.addLamp(new Lamp(60));
        meeting.addLamp(new Lamp(100));
        meeting.addWindow(new Window(120, 90));
        meeting.addWindow(new Window(120, 90));

        Room kitchen = new Room("Køkken");
        kitchen.addLamp(new Lamp(40));
        kitchen.addLamp(new Lamp(40));
        kitchen.addWindow(new Window(60, 60));

        Room office = new Room("Kontor");
        office.addLamp(new Lamp(80));
        office.addLamp(new Lamp(80));
        office.addWindow(new Window(100, 100));

        //tilføjer rummene til bygningen
        b.addRoom(meeting);
        b.addRoom(kitchen);
        b.addRoom(office);

        b.printBuilding();
    }
}
