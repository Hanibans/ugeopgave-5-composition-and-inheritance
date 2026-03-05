package Del1;

public class Window {
    private int widthCm;
    private int heightCm;

    //konstruktør, som bliver kaldt når vi laver en ny Window
    public Window(int widthCm, int heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    //beregner vinduets areal
    public int getArenaCm2() {
        return widthCm * heightCm;
    }

    @Override
    public String toString() {
        return widthCm + "x" + heightCm + "cm";
    }
}
