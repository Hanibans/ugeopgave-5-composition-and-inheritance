package Del1;

public class Lamp {
    private int watt;
    private boolean isOn;

    //konstruktør, som bliver kaldt når vi laver en ny Lamp
    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false; // lampen starter altid slukket
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getWatt() {
        return watt;
    }

    @Override
    public String toString() {
        return watt + "W";
    }
}